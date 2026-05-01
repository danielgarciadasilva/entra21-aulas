package POO.Basico.Herança.listadeexercicio.exercicio2;

public class Principal {
    public static void main(String[] args) {

        Professor professor = new Professor("Fernando", "fernando@senac.com.br", "Java");
        Pessoa pessoa = new Pessoa("Fernando", "fernando@senac.com.br");

        professor.apresentar();

        System.out.println("meu nome é: " + professor.getNome());
        System.out.println("meu e-mail é: " + professor.getEmail());
        System.out.println("minha disciplina é: " + professor.getDisciplina());

    }
}
