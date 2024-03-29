package MVP_ControladorSupervisado.Vista;

import MVP_ControladorSupervisado.Modelo.Unidades;
import MVP_ControladorSupervisado.Presentador.Presentador;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class VTermometroSwing implements IVTermometro {
    private JButton btnMenosTemp;
    private JButton btnMasTemp;
    private JRadioButton radioCelsius;
    private JRadioButton radioKelvin;
    private JRadioButton radioFahrenheit;
    private JLabel lblTitulo;
    private JPanel panelMain;
    private JTextField lblTemperatura;
    private JTextField lblUnidad;

    private Presentador presenter;

    private void setListeners() {

        btnMenosTemp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.disminuirTemperatura(e);
                presenter.getvaloresIniciales();
            }
        });
        btnMasTemp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.aumentarTemperatura(e);
                presenter.getvaloresIniciales();
            }
        });

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.convertir(e);
                presenter.getvaloresIniciales();
            }
        };
        radioCelsius.addActionListener(listener);
        radioFahrenheit.addActionListener(listener);
        radioKelvin.addActionListener(listener);

    }

    @Override
    public void setPresentador(Presentador p) {
        presenter = p;
    }

    @Override
    public void iniciar() {
        JFrame frame = new JFrame("TermometroMVP");
        frame.setContentPane(this.getPanelMain());
        frame.pack();
        frame.setVisible(true);
        frame.setSize(350, 500);
        frame.setLocationRelativeTo(null);
        //VALORES POR DEFECTO
        lblTemperatura.setText("0");
        lblUnidad.setText("CELSIUS");
        radioCelsius.setSelected(true);
        presenter.getvaloresIniciales();
        //ACTIVANDO LISTENERS
        this.setListeners();
    }

    @Override
    public double getValorTemperatura() {
        try {
            return Double.parseDouble(lblTemperatura.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Debe ingresar un valor double",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            return 0.0D;
        }
    }

    @Override
    public Unidades getUnidadTemperatura() {
        if (radioCelsius.isSelected()) {
            return Unidades.CELSIUS;
        }
        if (radioFahrenheit.isSelected()) {
            return Unidades.FAHRENHEIT;
        }
        if (radioKelvin.isSelected()) {
            return Unidades.KELVIN;
        }
        return null;
    }

    @Override
    public void setSalida(String valorResultante, String unidadResultante) {
        lblTemperatura.setText(valorResultante);
        lblUnidad.setText(unidadResultante);
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

    public JTextField getLblUnidad() {
        return lblUnidad;
    }

    public void setLblUnidad(JTextField lblUnidad) {
        this.lblUnidad = lblUnidad;
    }

}
