package MVP_VistaPasiva.Modelo;

public class ConvCelsiusToFahrenheit implements LogicaServicio{

    @Override
    public Mtemperatura convertir(Mtemperatura MTemp) {
        MTemp.setValorResultado(MTemp.getValorEntrada()*(1.8) + 32);
        return MTemp;
    }

}
