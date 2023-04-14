import java.util.Scanner;

public class EX013 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    //Declarando as variáveis e recebendo os valores
    int x;
    System.out.print("Digite um número inteiro positivo: ");
    x = ler.nextInt();
    while (x<0){
      System.out.println("Por favor, digite um número inteiro positivo");
      x = ler.nextInt();
    }
    //Mostrando somente os valores inteiros pares que ficam entre 1 e o número que o usuário digitou
    for (int i = 1; i<x; i++){
      if (i%2==0){
        System.out.print(i + ", ");
      }
    }
  }
}