import java.util.Scanner;

public class EX012 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Declarando as variáveis e recebendo os valores
    System.out.print("Digite a primeira nota: ");
    double nota1 = entrada.nextDouble();
    System.out.print("Digite a segunda nota: ");
    double nota2 = entrada.nextDouble();
    //Calculando a média
    double media = (nota1+nota2)/2;
    //Verificando se o aluno passou de ano
    if(media>=6){
      System.out.println("Parabéns !!! Você passou de ano !!!");
    }else{
      System.out.println("Sinto muito, mas você foi reprovado....");
    }

    entrada.close();
  }
}
