package POO.Basico.Polimorfismo.ListaDeExercicios.Exercicio2;

public class Pricnipal {
    public static void main(String[] args) {
        Veiculo corsa = new Carro();
        Veiculo bike = new Bicicleta();

        corsa.mover();
        bike.mover();
    }
}
