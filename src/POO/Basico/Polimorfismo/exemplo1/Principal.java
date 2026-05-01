package POO.Basico.Polimorfismo.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Animal rex = new Cachorro();
        Animal sushi = new Gato();

        rex.emitirSom();
        sushi.emitirSom();
    }
}
