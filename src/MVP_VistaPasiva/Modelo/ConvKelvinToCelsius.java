package MVP_VistaPasiva.Modelo;

public class ConvKelvinToCelsius implements LogicaServicio {
    
    @Override
    public Mtemperatura convertir(Mtemperatura MTemp) {
        MTemp.setValorResultado((MTemp.getValorEntrada()-273.15));
        return MTemp;
    }
    
}
