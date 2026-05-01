package POO.Basico.Abstracao.exemplo1.classeabstrata;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);

        Retangulo retangulo = new Retangulo(3, 4);

        double areaCirculo = circulo.calcaularArea();
        double areaRetangulo = retangulo.calcaularArea();

        System.out.println("A area do circulo é: " + areaCirculo);
        System.out.println("A area do retangulo é: " + areaRetangulo);

        FormaGeometricaAbstract quadrado = new Retangulo(2, 2);
        System.out.println("Area do quadrado é: " + quadrado.calcaularArea());
    }
}
