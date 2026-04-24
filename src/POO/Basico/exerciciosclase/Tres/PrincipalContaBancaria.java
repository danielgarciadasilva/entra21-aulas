package POO.Basico.exerciciosclase.Tres;

public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria(100);

        System.out.println(cb.sacar(20));
        System.out.println(cb.sacar(20));
        System.out.println(cb.sacar(0));
        System.out.println(cb.sacar(10_000));

    }
}
