package Polimorfismo.exemplo2;

public class Vendendor extends Funcionario {
    private double comissao;

    public Vendendor(double salarioBase, double comissao) {
        super.setSalarioBase(salarioBase);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularPagamento() {
        return super.getSalarioBase() + this.comissao;
    }
}
