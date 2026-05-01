package POO.Basico.Abstracao.exemplo1.classeabstrata;

public class Retangulo extends FormaGeometricaAbstract {
    private double altura;
    private double largura;

    public Retangulo (double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    double calcaularArea() {
        return altura * largura;
    }
}
