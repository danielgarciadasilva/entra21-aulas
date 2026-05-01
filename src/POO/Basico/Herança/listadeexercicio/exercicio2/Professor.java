package POO.Basico.Herança.listadeexercicio.exercicio2;

public class Professor extends Pessoa {
    private String Disciplina;

    public Professor(String nome, String email, String disciplina) {
        super(nome, email);
        Disciplina = disciplina;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String disciplina) {
        Disciplina = disciplina;
    }

    public void apresentar() {
        System.out.println("Meu nome é " + getNome() + "Professor de Java");
    }
}
