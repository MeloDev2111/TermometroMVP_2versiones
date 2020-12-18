package MVP_VistaPasiva.Presentador;

import MVP_VistaPasiva.Modelo.Mtemperatura;
import MVP_VistaPasiva.Vista.IVTermometro;
import MVP_VistaPasiva.Vista.VTermometroConsola;
import MVP_VistaPasiva.Vista.VTermometroSwing;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Mtemperatura Mtemperatura = new Mtemperatura();
        IVTermometro vistaTermometro = new VTermometroConsola();
        Presentador presenter = new Presentador(vistaTermometro,Mtemperatura);

        vistaTermometro.setPresentador(presenter);
        vistaTermometro.iniciar();
    }
}
