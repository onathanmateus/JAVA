package Exercises.PackOfExercises2;

public class EX016 {
  public static void main(String[] args) {
    msg("Bom dia!", 5);
    System.out.println(soma(1734617, 134761873));
  }
  //Classe criada para somar 2 valores
  public static int soma(int n1, int n2){
    int res = n1 + n2;
    return res;
  }
  //Classe criada para poder gerar uma mensagem na tela 
  public static void msg(String m, int v){
    for(int i = 0; i < v; i++){
      System.out.println(m);
    }
  }
}
