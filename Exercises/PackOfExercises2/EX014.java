package Exercises.PackOfExercises2;
import java.util.Scanner;

public class EX014 {
  public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    //Declarando as variáveis e recebendo os valores
    float y, xfinal, xinicial;
    System.out.print("Digite um número para você encontrar a raiz quadrada: ");
    y = ler.nextFloat();
    //Verificando se o usuário digitou um número positivo
    while(y < 0){
      System.out.print("Por favor, digite um número positivo: ");
      y = ler.nextFloat();
    }
    xinicial = y/2;
    xfinal = 0;
    while(Math.abs(xfinal - xinicial) >= 0.1){
      xfinal = xinicial-((xinicial * xinicial - y)/(2 * xinicial));
      xinicial = xfinal;
    }
    System.out.println("Resultado = "+xfinal);
    System.out.println("Erro comparado ao método java: "+(Math.abs(xfinal - Math.sqrt(y))));
    ler.close();
  }
}
