package POO.Basico.exerciciosclase.Um;

public class Aluno {
        String nome;
        int idade;

        public Aluno(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        void estudar() {
            System.out.println("ola meu nome é: " + this.nome);
            System.out.println("minha idade é: " + this.idade);
            System.out.println("Estou estudando!");
        }
    }

