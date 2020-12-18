package MVP_VistaPasiva.Modelo;

public class ConvKelvinToFahrenheit implements LogicaServicio {

    @Override
    public Mtemperatura convertir(Mtemperatura MTemp) {
        MTemp.setValorResultado((MTemp.getValorEntrada()-273.15)*(1.8)+32);
        return MTemp;
    }
}
