import java.util.Scanner;

public class EX004 {
  public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
    
    System.out.print("Digite o valor da nota A1: ");
    float n1 = Teclado.nextFloat();
    System.out.print("Digite o valor da nota A2: ");
    float n2 = Teclado.nextFloat();
    float m = (n1 + n2)/2;
    System.out.println("A média é: " + m);
    
    if (m > 7){
      System.out.print("Parabéns, você foi aprovado !!");
    } else{
      System.out.print("Reprovado !!");
    } 
  }
}
