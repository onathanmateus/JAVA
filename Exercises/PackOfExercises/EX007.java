package Exercises.PackOfExercises;

import java.util.Scanner;

public class EX007 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    // Lê os valores de A, B e C
    System.out.print("Digite o valor de A: ");
    int a = entrada.nextInt();
    System.out.print("Digite o valor de B: ");
    int b = entrada.nextInt();
    System.out.print("Digite o valor de C: ");
    int c = entrada.nextInt();
    // Calcula os valores de R e S
    int r = (int) Math.pow(a + b, 2);
    int s = (int) Math.pow(b + c, 2);
    // Calcula o valor de D
    int d = (r + s) / 2;
    // Exibe o resultado
    System.out.println("O valor de D é: " + d);
    entrada.close();
  }
}
