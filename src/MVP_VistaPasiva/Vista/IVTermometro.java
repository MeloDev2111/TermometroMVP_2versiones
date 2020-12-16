package MVP_VistaPasiva.Vista;

import MVP_VistaPasiva.Modelo.Unidades;
import MVP_VistaPasiva.Presentador.Presentador;

public interface IVTermometro {
    public void setPresenter(Presentador p);
    public void mostrar();
    public double getValorTemperatura();
    public Unidades getUnidadTemperatura();
    public void convertir();
}
