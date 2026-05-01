package POO.Basico.Polimorfismo.ListaDeExercicios.Exercicio1;

public class Principal {
    public static void main(String[] args) {
        Animal kaka = new Cachorro();
        Animal missi = new Gato();

        kaka.emitirsom();
        missi.emitirsom();
    }
}
