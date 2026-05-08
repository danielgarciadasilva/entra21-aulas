package POO.Basico.Refatoracao.Exercicio2;

public class Gerente extends Funcionario {

    private double salarioFixo;

    public Gerente(String nome, double salarioFixo) {
        super(nome);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return salarioFixo;
    }
}
