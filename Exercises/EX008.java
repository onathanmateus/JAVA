import java.util.Scanner;

public class EX008{
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    // Lê os valores de a, b, c, d, e e f
    System.out.print("Digite o valor de a: ");
    double a = entrada.nextDouble();
    System.out.print("Digite o valor de b: ");
    double b = entrada.nextDouble();
    System.out.print("Digite o valor de c: ");
    double c = entrada.nextDouble();
    System.out.print("Digite o valor de d: ");
    double d = entrada.nextDouble();
    System.out.print("Digite o valor de e: ");
    double e = entrada.nextDouble();
    System.out.print("Digite o valor de f: ");
    double f = entrada.nextDouble();
    // Calcula os valores de x e y
    double x = (c * e - b * f) / (a * e - b * d);
    double y = (a * f - c * d) / (a * e - b * d);
    // Exibe o resultado
    System.out.println("O valor de x é: " + x);
    System.out.println("O valor de y é: " + y);

    entrada.close();
  }
}
