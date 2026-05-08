package POO.Basico.Refatoracao.Exercicio2;

public class Estagiario extends Funcionario {

    private double valorHora;
    private int horasTrabalhadas;

    public Estagiario(String nome, double valorHora, int horasTrabalhadas) {
        super(nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }


    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}
