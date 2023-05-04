package Exercises.PackOfExercises2;
import java.security.SecureRandom;

public class EX015 {
  public static void main(String[] args) {
    //Configurando e criando a matriz
    int linhas = 5;
    int colunas = 5;
    int[][] matriz = new int[linhas][colunas];
    //Preenchendo a matriz com números aleatórios
    for(int l = 0; l < linhas; l++){
      for(int c = 0; c < colunas; c++){
        matriz[l][c] = new SecureRandom().nextInt(100);
      }
    }
    //Mostrando a matriz na tela'
    for(int l = 0; l < linhas; l++){
      for(int c = 0; c < colunas; c++){
        System.out.printf("%d | ",matriz[l][c]);
      }
      System.out.printf("%n");
    }
  }
}
