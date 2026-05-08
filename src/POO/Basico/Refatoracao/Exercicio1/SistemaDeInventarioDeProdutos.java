package POO.Basico.Refatoracao.Exercicio1;

import java.util.Scanner;

public class SistemaDeInventarioDeProdutos {
    public static BancoProdutos bancoProdutos = new BancoProdutos();

        // "Banco de dados" em memória: [Nome, Preco, Quantidade]
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao;
            do {
                System.out.println("\n--- Inventário ---");
                System.out.println("1. Adicionar Produto");
                System.out.println("2. Listar Produtos");
                System.out.println("3. Calcular Valor Total do Estoque");
                System.out.println("0. Sair");
                System.out.print("Digite uma das Opções acima: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Preço: ");
                        String preco = scanner.nextLine();
                        System.out.print("Quantidade: ");
                        String quantidade = scanner.nextLine();
                        Produto produto = new Produto(nome, Double.parseDouble(preco), Integer.parseInt(quantidade));
                        bancoProdutos.adicionar(produto);
                        break;
                    case 2:
                        bancoProdutos.listar();
                        break;
                    case 3:
                        bancoProdutos.calcularTotal();
                        break;
                }
            } while (opcao != 0);
        }
}

