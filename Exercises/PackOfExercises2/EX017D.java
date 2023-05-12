package Exercises.PackOfExercises2;

public class EX017D {
  public static void main(String[] args) {
    System.out.println("------------------CADASTRO DE ALUNOS-----------------");
    EX017B a = new EX017B("Nathan", "123.456.789-01", "ADS");
    System.out.println("Nome: "+a.nome);
    System.out.println("CPF: "+a.cpf);
    System.out.println("Disciplina: "+a.disciplina);
  }
}
