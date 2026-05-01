package POO.Basico.Abstracao.exemplo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorDaCompra = sc.nextDouble();
        sc.nextLine();

        System.out.println("Escolha uma forma de pagamento");
        System.out.println("[1] - Pix");
        System.out.println("[2] - Boleto");
        int formaDePagamento = sc.nextInt();
        sc.nextLine();
        if (formaDePagamento == 1) {
            Pagamento pagamento = new Pix(valorDaCompra);
            pagamento.processar();
        } else if (formaDePagamento == 2) {
            Pagamento pagamento = new Boleto(valorDaCompra);
            pagamento.processar();
        } else {
            System.out.println("Digita certo ai mano");
        }
    }
}