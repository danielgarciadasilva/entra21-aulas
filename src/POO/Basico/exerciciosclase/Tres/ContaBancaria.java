package POO.Basico.exerciciosclase.Tres;

public class ContaBancaria {
    double saldo;

    public ContaBancaria(double saldo) {
        if(saldo < 0) {
            System.out.println("Saldo Invalido");
            throw new IllegalArgumentException();
        }

        this.saldo = saldo;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor Invalido");
        } else {
            this.saldo = this.saldo + valor;
        }
    }

    String sacar(double valor) {
        if (valor <= 0) {
            return "Valor Invalido";
        } else if (valor > saldo) {
            return "Saldo Insuficiente!";
        } else {
            this.saldo = this.saldo - valor;
            return "Saque efetuado, seu novo saldo é " + this.saldo;
        }
    }
 }
