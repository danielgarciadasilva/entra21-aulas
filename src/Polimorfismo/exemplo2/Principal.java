package Polimorfismo.exemplo2;

public class Principal {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        gerente.setSalarioBase(10_000d);

        System.out.println("O salario do gerente é: " +  gerente.getSalarioBase());

        Funcionario funcionarioComun = new Funcionario();
        funcionarioComun.setSalarioBase(3_000d);
        System.out.println("O salario do funcionario é " + funcionarioComun.calcularPagamento());

        Funcionario vendedor = new Vendendor(2_000d, 3_000d);
        System.out.println("O salario do vendedor é: " + vendedor.calcularPagamento());
    }
}
