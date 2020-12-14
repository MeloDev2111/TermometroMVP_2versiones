package MVP_VistaPasiva.Vista;

import MVP_VistaPasiva.Modelo.Mtemperatura;

public class VTermometroConsola {

    private Mtemperatura mtemperatura;

    public VTermometroConsola(Mtemperatura mtemperatura){
        this.mtemperatura = mtemperatura;
    }

    public void mostrarIngreso(){
        //Validacion validacion = new Validacion();
        //System.out.println("Ingrese Unidad del Valor Entrante: ");
        //System.out.println("Celsius (C) - Farenheit(F) - Kelvin(K)");
        //mtemperatura.setUnidadEntrada(validacion.inUnidad());
        //System.out.println("Ingrese el valor Entrante: ");
        //mtemperatura.setValorEntrada(validacion.inDouble());
        //System.out.println("Ingrese Unidad a convertir: ");
        //System.out.println("ACelsius (C)-A Farenheit(F)-A Kelvin(K)");
        //mtemperatura.setUnidadResultado(validacion.inUnidad());
    }
    public void mostrarSalida(){
        System.out.println("El resultado es:"
                +mtemperatura.getValorResultado()
                +" "+mtemperatura.getUnidadResultado());
    }

}
