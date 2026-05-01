package POO.Basico.Abstracao.exemplo1.classeabstrata;

public class Circulo extends FormaGeometricaAbstract {

    private double raio;

    public Circulo (double raio) {
        this.raio = raio;
    }

    @Override
    double calcaularArea() {
        return raio * raio * Math.PI;
    }
}
