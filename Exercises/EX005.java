import java.util.Scanner;

public class EX005 {
  public static void main(String[] args){
    Scanner tec = new Scanner(System.in);
    
    System.out.println("Informe quantas pernas tem o animal: ");
    int pernas = tec.nextInt();
    String tipo;
    System.out.println("O animal escolhido pelo usuário foi um: ");
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
  }
}

