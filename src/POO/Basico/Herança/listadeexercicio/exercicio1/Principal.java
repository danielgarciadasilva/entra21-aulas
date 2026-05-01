package POO.Basico.Herança.listadeexercicio.exercicio1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Daniel",39);
        Aluno aluno = new Aluno("Jorge", 22, "cadastrado1234");

        aluno.apresentar();

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Idade do aluno: " + aluno.getIdade());
        System.out.println("Matricula do aluno: " + aluno.getMatricula());

    }
}
