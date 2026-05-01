package POO.Basico.Herança.exemplo2;

public class Principal {

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Daniel", 100_000, 500_000);
        System.out.println("O salario total de " + vendedor.getnome() + " è " + vendedor.getSalariTotal());
    }
}
