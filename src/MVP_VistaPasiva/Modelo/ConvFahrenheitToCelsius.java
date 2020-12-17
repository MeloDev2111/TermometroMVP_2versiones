package MVP_VistaPasiva.Modelo;

public class ConvFahrenheitToCelsius implements LogicaServicio {

    @Override
    public Mtemperatura convertir(Mtemperatura MTemp) {
        MTemp.setValorResultado((MTemp.getValorEntrada()-32)*5/9);
        return MTemp;
    }
}
