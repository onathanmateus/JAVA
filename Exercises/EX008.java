import java.util.Scanner;

public class EX008{
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    // Lê os valores de a, b, c, d, e e f
    System.out.print("Digite o valor de a: ");
    int a = entrada.nextInt();
    System.out.print("Digite o valor de b: ");
    int b = entrada.nextInt();
    System.out.print("Digite o valor de c: ");
    int c = entrada.nextInt();
    System.out.print("Digite o valor de d: ");
    int d = entrada.nextInt();
    System.out.print("Digite o valor de e: ");
    int e = entrada.nextInt();
    System.out.print("Digite o valor de f: ");
    int f = entrada.nextInt();
    // Calcula os valores de x e y
    int x = (c * e - b * f) / (a * e - b * d);                                      
    int y = (a * f - c * d) / (a * e - b * d);
    // Exibe o resultado
    System.out.println("O valor de x é: " + x);
    System.out.println("O valor de y é: " + y);

    entrada.close();
  }
}
