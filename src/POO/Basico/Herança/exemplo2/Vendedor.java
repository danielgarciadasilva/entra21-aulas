package POO.Basico.Herança.exemplo2;

public class Vendedor extends Funcionario {

    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome,salarioBase);
        this.comissao = comissao;
    }

     public double getSalariTotal() {
        return this.getSalarioBase() + this.comissao;
    }
}
