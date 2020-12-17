package MVP_VistaPasiva.Vista;

import MVP_VistaPasiva.Modelo.Unidades;
import MVP_VistaPasiva.Presentador.Presentador;

public interface IVTermometro {
    public void setPresentador(Presentador p);
    public void iniciar();
    public double getValorTemperatura();
    public Unidades getUnidadTemperatura();
    public void setSalida(String valorResultante);
}
