package Exercises.PackOfExercises;

import java.util.Scanner;

public class EX004 {
  public static void main(String[] args) {
    //configurando o scanner
    Scanner teclado = new Scanner(System.in);
    //Criando as variáveis e recebendo os valores
    System.out.print("Digite o valor da nota A1: ");
    float n1 = teclado.nextFloat();
    System.out.print("Digite o valor da nota A2: ");
    float n2 = teclado.nextFloat();
    //Calculando a média entre os números 
    float m = (n1 + n2)/2;
    System.out.println("A média é: " + m);
    //Verificando se a média foi maior ou menor que 7
    if (m > 7){
      System.out.print("Parabéns, você foi aprovado !!");
    } else{
      System.out.print("Reprovado !!");
    }
    teclado.close();
  }
}
