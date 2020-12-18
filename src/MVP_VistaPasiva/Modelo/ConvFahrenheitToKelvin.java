package MVP_VistaPasiva.Modelo;

public class ConvFahrenheitToKelvin implements LogicaServicio {

    @Override
    public Mtemperatura convertir(Mtemperatura MTemp) {
        MTemp.setValorResultado(((MTemp.getValorEntrada()-32)*5/9)+273.15);
        return MTemp;
    }
}
