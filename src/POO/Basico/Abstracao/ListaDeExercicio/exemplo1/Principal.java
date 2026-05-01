package POO.Basico.Abstracao.ListaDeExercicio.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Cachorro KAKA = new Cachorro();
        Gato PULGA = new Gato();

        System.out.println(KAKA.emitirSom());
        System.out.println(PULGA.emitirSom());
    }
}
