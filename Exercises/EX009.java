import java.util.Scanner;

public class EX009 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Declarando as variáveis e recebendo os valores
    System.out.println("Digite a primeira nota: ");
    float n1 = entrada.nextFloat();
    System.out.println("Digite a segunda nota: ");
    float n2 = entrada.nextFloat();
    System.out.println("Digite a terceira nota: ");
    float n3 = entrada.nextFloat();
    //Calculando a média ponderada
    float m = (n1+n2+n3)/(2+3+5);
    //Mostrando o resultado na tela
    System.out.println("A média ponderada das 3 notas é de: "+m);

    entrada.close();
  }
}
