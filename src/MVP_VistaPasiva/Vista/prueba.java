package MVP_VistaPasiva.Vista;

import javax.swing.*;

public class prueba {
    public static void main(String[] args) {
        VTermometroSwing vistaTermometro = new VTermometroSwing();
        JFrame frame = new JFrame("TermometroMVP");
        frame.setContentPane(vistaTermometro.getPanelMain());
        frame.pack();
        frame.setVisible(true);
        frame.setSize(350,475);
        frame.setLocationRelativeTo(null);
    }
}
