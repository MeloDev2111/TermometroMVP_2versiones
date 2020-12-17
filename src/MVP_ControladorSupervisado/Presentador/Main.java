package MVP_ControladorSupervisado.Presentador;

import MVP_ControladorSupervisado.Modelo.Mtemperatura;
import MVP_ControladorSupervisado.Vista.IVTermometro;
import MVP_ControladorSupervisado.Vista.VTermometroSwing;

public class Main {
    public static void main(String[] args) {
        Mtemperatura Mtemperatura = new Mtemperatura();
        IVTermometro vistaTermometro = new VTermometroSwing();
        Presentador presenter = new Presentador(vistaTermometro,Mtemperatura);

        vistaTermometro.setPresentador(presenter);
        vistaTermometro.iniciar();
    }
}
