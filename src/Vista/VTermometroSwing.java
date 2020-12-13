package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VTermometroSwing {
    private JButton btnMenosTemp;
    private JButton btnMasTemp;
    private JRadioButton radioCelsius;
    private JRadioButton radioKelvin;
    private JRadioButton radioFahrenheit;
    private JLabel lblTitulo;
    private JPanel panelMain;
    private JTextField lblTemperatura;


    //getters and setters

    public JButton getBtnMenosTemp() {
        return btnMenosTemp;
    }

    public void setBtnMenosTemp(JButton btnMenosTemp) {
        this.btnMenosTemp = btnMenosTemp;
    }

    public JButton getBtnMasTemp() {
        return btnMasTemp;
    }

    public void setBtnMasTemp(JButton btnMasTemp) {
        this.btnMasTemp = btnMasTemp;
    }

    public JRadioButton getRadioCelsius() {
        return radioCelsius;
    }

    public void setRadioCelsius(JRadioButton radioCelsius) {
        this.radioCelsius = radioCelsius;
    }

    public JRadioButton getRadioKelvin() {
        return radioKelvin;
    }

    public void setRadioKelvin(JRadioButton radioKelvin) {
        this.radioKelvin = radioKelvin;
    }

    public JRadioButton getRadioFahrenheit() {
        return radioFahrenheit;
    }

    public void setRadioFahrenheit(JRadioButton radioFahrenheit) {
        this.radioFahrenheit = radioFahrenheit;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JPanel getPanelMain() {
        return panelMain;
    }

    public void setPanelMain(JPanel panelMain) {
        this.panelMain = panelMain;
    }

    public JTextField getLblTemperatura() {
        return lblTemperatura;
    }

    public void setLblTemperatura(JTextField lblTemperatura) {
        this.lblTemperatura = lblTemperatura;
    }
}
