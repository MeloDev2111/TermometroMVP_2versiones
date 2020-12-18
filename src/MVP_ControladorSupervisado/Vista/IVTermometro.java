package MVP_ControladorSupervisado.Vista;

import MVP_ControladorSupervisado.Modelo.Unidades;
import MVP_ControladorSupervisado.Presentador.Presentador;

public interface IVTermometro {
    public void setPresentador(Presentador p);
    public void iniciar();
    public double getValorTemperatura();
    public Unidades getUnidadTemperatura();
    public void setSalida(String valorResultant, String unidadResultado);
}
