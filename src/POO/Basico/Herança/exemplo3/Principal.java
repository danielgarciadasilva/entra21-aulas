package POO.Basico.Herança.exemplo3;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Bonequinha de Brinquedo");
        produto.setPreco(100d);

        produto.exibirInformacoes();

        System.out.println("=============");

        Livro livro = new Livro();
        livro.setNome("E não sobrou ninguem");
        livro.setPreco(59.90d);
        livro.setAutor("Agatha Cristie");

        livro.exibirInformacoes();
    }
}
