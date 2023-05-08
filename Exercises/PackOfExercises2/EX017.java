package Exercises.PackOfExercises2;
import java.util.Scanner;

public class EX017 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int escolha;
    //Menu onde o usuário poderá escolher a operação matemática desejada
    do{
      System.out.println("Mini Calculadora !!");
      System.out.println("1 - Soma");
      System.out.println("2 - Subtração");
      System.out.println("3 - Multiplicação");
      System.out.println("4 - Divisão");
      System.out.print("Qual operação matemática você deseja usar (Digite um número)? ");
      escolha = ler.nextInt();
    }while(escolha >= 5 || escolha <= 0);
    switch (escolha){
      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      default:
        
    }

    ler.close();
  }
}
