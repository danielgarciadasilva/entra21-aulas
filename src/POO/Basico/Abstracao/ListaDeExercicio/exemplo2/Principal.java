package POO.Basico.Abstracao.ListaDeExercicio.exemplo2;

public class Principal {
    public static void main(String[] args) {
        Veiculo corsa = new Carro();
        Veiculo monark = new Bicicleta();

        System.out.println(corsa.mover());
        System.out.println(monark.mover());
    }
}
