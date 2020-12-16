package MVP_VistaPasiva.Presentador;

import MVP_VistaPasiva.Modelo.Mtemperatura;
import MVP_VistaPasiva.Modelo.Unidades;
import MVP_VistaPasiva.Vista.IVTermometro;

public class Presentador {
    private IVTermometro ivista;
    private Mtemperatura modelo;

    public Presentador(IVTermometro ivista, Mtemperatura modelo) {
        this.ivista = ivista;
        this.modelo = modelo;
    }

    public void presentar(){
        ivista.mostrar();
        modelo.setValorEntrada(ivista.getValorTemperatura());
        modelo.setUnidadEntrada(ivista.getUnidadTemperatura());
        

    }


    public void conversion(){

    }
}
