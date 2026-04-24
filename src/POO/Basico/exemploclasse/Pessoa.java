package POO.Basico.exemploclasse;

public class Pessoa {
    String nome;
    int idade;
    double peso;

    public Pessoa(){}

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar () {
        System.out.println("Ola meu nome é " + this.nome);
        System.out.println("Minha idade é " + this.idade);
    }
}
