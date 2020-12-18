package MVP_VistaPasiva.Presentador;

import MVP_VistaPasiva.Modelo.*;
import MVP_VistaPasiva.Vista.IVTermometro;

public class Presentador {
    private IVTermometro vista;
    private Mtemperatura mtemperatura;

    public Presentador(IVTermometro vista, Mtemperatura mtemperatura) {
        this.vista = vista;
        this.mtemperatura = mtemperatura;
    }

    public void convertir(){
        mtemperatura.setUnidadResultado(vista.getUnidadTemperatura());
        ejecutarLogica();
        vista.setSalida(String.valueOf(mtemperatura.getValorResultado()),
                        mtemperatura.getUnidadResultado().toString());
    }

    public void aumentarTemperatura(){
        ConvSameToSame logica = logica = new ConvSameToSame();
        getvaloresIniciales();
        logica.aumentarTemperatura(mtemperatura);
        vista.setSalida(String.valueOf(mtemperatura.getValorResultado()),
                        mtemperatura.getUnidadResultado().toString());
    }
    public void disminuirTemperatura(){
        ConvSameToSame logica = logica = new ConvSameToSame();
        getvaloresIniciales();
        logica.disminuirTemperatura(mtemperatura);

        vista.setSalida(String.valueOf(mtemperatura.getValorResultado()),
                        mtemperatura.getUnidadResultado().toString());
    }

    public void getvaloresIniciales(){
        mtemperatura.setValorEntrada(vista.getValorTemperatura());
        mtemperatura.setUnidadEntrada(vista.getUnidadTemperatura());
    }
    private void ejecutarLogica(){
        LogicaServicio logica = null;
        switch (mtemperatura.getUnidadEntrada()) {
            case CELSIUS:
                switch (mtemperatura.getUnidadResultado()) {
                    case CELSIUS:
                        logica = new ConvSameToSame();
                        break;
                    case FAHRENHEIT:
                        logica = new ConvCelsiusToFahrenheit();
                        break;
                    case KELVIN:
                        logica = new ConvCelsiusToKelvin();
                        break;
                }
                break;
            case FAHRENHEIT:
                switch (mtemperatura.getUnidadResultado()) {
                    case CELSIUS:
                        logica = new ConvFahrenheitToCelsius();
                        break;
                    case FAHRENHEIT:
                        logica = new ConvSameToSame();
                        break;
                    case KELVIN:
                        logica = new ConvFahrenheitToKelvin();
                        break;
                }
                break;
            case KELVIN:
                switch (mtemperatura.getUnidadResultado()) {
                    case CELSIUS:
                        logica = new ConvKelvinToCelsius();
                        break;
                    case FAHRENHEIT:
                        logica = new ConvKelvinToFahrenheit();
                        break;
                    case KELVIN:
                        logica = new ConvSameToSame();
                        break;
                }
        }
        logica.convertir(mtemperatura);
    }
}
