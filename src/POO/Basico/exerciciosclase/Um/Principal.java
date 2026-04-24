package POO.Basico.exerciciosclase.Um;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Daniel", 39);

        Aluno aluno2 = new Aluno("Diego", 37);

        aluno1.estudar();
        aluno2.estudar();
    }
}
