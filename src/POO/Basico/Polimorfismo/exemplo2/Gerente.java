package POO.Basico.Polimorfismo.exemplo2;

public class Gerente extends Funcionario {

    @Override
    public double calcularPagamento() {
        return super.getSalarioBase() + 1_000d;
    }
}
