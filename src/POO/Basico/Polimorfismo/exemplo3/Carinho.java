package POO.Basico.Polimorfismo.exemplo3;

public class Carinho {

    private double valorCompra;

    public Carinho(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void realizarCompra(MetodoPagamento metodoPagamento) {
        metodoPagamento.pagarAVista();
        System.out.println("Compra realizada com sucesso!");
    }
}
