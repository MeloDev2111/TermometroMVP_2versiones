package MVP_VistaPasiva.Modelo;

public class Mtemperatura {
    private Unidades unidadEntrada;
    private Unidades unidadResultado;
    private double valorEntrada;
    private double valorResultado;

    //getters and setters

    public Unidades getUnidadEntrada() {
        return unidadEntrada;
    }

    public void setUnidadEntrada(Unidades unidadEntrada) {
        this.unidadEntrada = unidadEntrada;
    }

    public Unidades getUnidadResultado() {
        return unidadResultado;
    }

    public void setUnidadResultado(Unidades unidadResultado) {
        this.unidadResultado = unidadResultado;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public double getValorResultado() {
        return valorResultado;
    }

    public void setValorResultado(double valorResultado) {
        this.valorResultado = valorResultado;
    }
}
