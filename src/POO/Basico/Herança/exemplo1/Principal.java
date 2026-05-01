package POO.Basico.Herança.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(18,"Daniel");
        Aluno aluno = new Aluno(18, "Jorge", "abc1234efg");

        aluno.apresentar();

        System.out.println("nome aluno: " + aluno.getNome());
        System.out.println("Idade aluno: " + aluno.getIdade());
        System.out.println("Matricula aluno: " + aluno.getMatricula());
    }
}
