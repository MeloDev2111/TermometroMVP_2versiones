package MVP_VistaPasiva.Vista;


import MVP_VistaPasiva.Modelo.Unidades;
import MVP_VistaPasiva.Presentador.Presentador;

import javax.swing.*;


public class VTermometroConsola {
    private Presentador presenter;
    private Validacion validar = new Validacion();

    public void setPresenter(Presentador p){
        presenter=p;
    }

    public void mostrar(){
    }

    public double getValorTemperatura(){
        System.out.println("Ingrese Valor Temperatura");
        return validar.inDouble();
    }

    public Unidades getUnidadTemperatura(){
        System.out.println("Ingrese Unidad Temperatura");
        return validar.inUnidad();
    }

    public void convertir(){
        System.out.println("El resultado de la conversión es:");
        presenter.conversion();
    }

}
