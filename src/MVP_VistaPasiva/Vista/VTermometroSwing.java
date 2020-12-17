package MVP_VistaPasiva.Vista;

import MVP_VistaPasiva.Modelo.Unidades;
import MVP_VistaPasiva.Presentador.Presentador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VTermometroSwing implements IVTermometro{
    private JButton btnMenosTemp;
    private JButton btnMasTemp;
    private JRadioButton radioCelsius;
    private JRadioButton radioKelvin;
    private JRadioButton radioFahrenheit;
    private JLabel lblTitulo;
    private JPanel panelMain;
    private JTextField lblTemperatura;

    private Presentador presenter;

    private void setListeners() {
        btnMenosTemp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.disminuirTemperatura();
                presenter.getvaloresIniciales();
            }
        });
        btnMasTemp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.aumentarTemperatura();
                presenter.getvaloresIniciales();
            }
        });

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.convertir();
                presenter.getvaloresIniciales();
            }
        };
        radioCelsius.addActionListener(listener);
        radioFahrenheit.addActionListener(listener);
        radioKelvin.addActionListener(listener);

    }
    public void setPresentador(Presentador p){
        presenter=p;
    }

    public void iniciar(){
        JFrame frame = new JFrame("TermometroMVP");
        frame.setContentPane(this.getPanelMain());
        frame.pack();
        frame.setVisible(true);
        frame.setSize(350,475);
        frame.setLocationRelativeTo(null);
        //VALORES POR DEFECTO
        lblTemperatura.setText("0");
        radioCelsius.setSelected(true);
        presenter.getvaloresIniciales();
        //ACTIVANDO LISTENERS
        this.setListeners();
    }
    public double getValorTemperatura(){
        try {
            return Double.parseDouble(lblTemperatura.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Debe ingresar un valor double",
                    "ERROR",JOptionPane.ERROR_MESSAGE);
            return 0.0D;
        }
    }

    public Unidades getUnidadTemperatura(){
        if (radioCelsius.isSelected()){
            return Unidades.CELSIUS;
        }
        if (radioFahrenheit.isSelected()){
            return Unidades.FAHRENHEIT;
        }
        if (radioKelvin.isSelected()){
            return Unidades.KELVIN;
        }
        return null;
    }
    public void setSalida(String valorResultante){
        lblTemperatura.setText(valorResultante);
    }
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
