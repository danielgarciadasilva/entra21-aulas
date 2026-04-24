package POO.Basico.exemploclasse;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fernando", 22);

        Pessoa pessoa2 = new Pessoa("Luigi", 58);

        Pessoa pessoa3 = new Pessoa();
        pessoa1.apresentar();
        pessoa2.apresentar();
//
//        Carro carro1 = new Carro();
//        carro1.ano = 1994;
//        carro1.cor = "vermelho";
//        carro1.marca = "mazda";
//        carro1.modelo = "miata MX-5";
//        carro1.dono = pessoa3;
//
//        carro1.ligar();
    }
}
