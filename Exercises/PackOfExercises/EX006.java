package Exercises.PackOfExercises;

import java.util.Scanner;

public class EX006 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    // Lê as coordenadas do primeiro ponto
    System.out.print("Digite a coordenada x do primeiro ponto: ");
    int x1 = entrada.nextInt();
    System.out.print("Digite a coordenada y do primeiro ponto: ");
    int y1 = entrada.nextInt();
    // Lê as coordenadas do segundo ponto
    System.out.print("Digite a coordenada x do segundo ponto: ");          
    int x2 = entrada.nextInt();
    System.out.print("Digite a coordenada y do segundo ponto: ");
    int y2 = entrada.nextInt();
    // Calcula a distância entre os pontos
    double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    // Exibe o resultado
    System.out.println("A distância entre os pontos (" + x1 + ", " + y1 + ") e (" + x2 + ", " + y2 + ") é " + distancia);
    entrada.close();
  }
}
