import java.util.Scanner;

public class EX011{
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Declarando as variáveis e recebendo os valores
    System.out.print("Digite a primeira nota: ");
    double nota1 = entrada.nextDouble();
    System.out.print("Digite a segunda nota: ");
    double nota2 = entrada.nextDouble();
    //Calculando a média
    double media = (nota1+nota2)/2;
    //Mostrando a média final na tela
    System.out.println("A média das duas notas é de: "+media);

    entrada.close();
  }
}