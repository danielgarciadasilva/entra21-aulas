package POO.Basico.Polimorfismo.exemplo3;

public class Pix extends MetodoPagamento {

    @Override
    public void pagarAVista() {
        System.out.println("Pagando com PIX");
    }
}
