import java.util.Scanner;

public class EX010 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Declarando variáveis e recebendo os valores 
    System.out.print("Digite o custo de fábrica do veículo novo: ");
    float cf = entrada.nextFloat();
    //Calculando os juros
    float jd = ((0.28f)*cf);
    float i = ((0.45f)*cf);
    //Calculando o custo final do veículo para o consumidor
    float cc = (cf+jd+i);
    //Mostrando o resultado na tela
    System.out.println("O custo do veículo para o consumidor final é de: "+cc);

    entrada.close();
  }
}
