package Exercises.PackOfExercises;
import java.util.Scanner;

public class EX005 {
  public static void main(String[] args){
    //Configurando o scanner
    Scanner tec = new Scanner(System.in);
    //Criando as variáveis e recebendo os valores
    System.out.println("Informe quantas pernas tem o animal: ");
    int pernas = tec.nextInt();
    String tipo;
    System.out.println("O animal escolhido pelo usuário foi um: ");
    //Verificando a quantidade de pernas que foi informado
    switch (pernas){
      case 1: 
        tipo = "saci";
        break;
      case 2:
        tipo = "bípedes";
        break;
      case 6,8:
        tipo = "aranha";
        break;
      default:
        tipo = "et";
    }
    System.out.println(tipo);
    tec.close();
  }
}
