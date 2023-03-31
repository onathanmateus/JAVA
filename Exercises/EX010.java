import java.util.Scanner;

public class EX010 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Declarando variáveis e recebendo os valores 
    System.out.print("Digite o custo de fábrica do veículo novo: ");
    float custoFabrica = entrada.nextFloat();
    //Calculando os juros
    float jurosDistribuidor = ((0.28f)*custoFabrica);
    float impostos = ((0.45f)*custoFabrica);
    //Calculando o custo final do veículo para o consumidor
    float custoConsumidor = (custoFabrica+jurosDistribuidor+impostos);
    //Mostrando o resultado na tela
    System.out.println("O custo do veículo para o consumidor final é de: "+custoConsumidor);

    entrada.close();
  }
}
