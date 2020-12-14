package MVP_VistaPasiva.Presentador;

import MVP_VistaPasiva.Modelo.Mtemperatura;
import MVP_VistaPasiva.Vista.IVTermometro;
import MVP_VistaPasiva.Vista.VTermometroSwing;

import javax.swing.*;

public class Presentador {
    private IVTermometro ivista;
    private Mtemperatura modelo;

    public Presentador(IVTermometro ivista, Mtemperatura modelo) {
        this.ivista = ivista;
        this.modelo = modelo;
    }

    public void presentar(){
        VTermometroSwing vistaTermometro = new VTermometroSwing();
        JFrame frame = new JFrame("TermometroMVP");
        frame.setContentPane(vistaTermometro.getPanelMain());
        frame.pack();
        frame.setVisible(true);
        frame.setSize(350,475);
        frame.setLocationRelativeTo(null);
    }

    public void mostrarVistaSwing(){

    }
    public void calcular(){

    }
}
