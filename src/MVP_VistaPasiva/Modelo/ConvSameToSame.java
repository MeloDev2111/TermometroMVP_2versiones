package MVP_VistaPasiva.Modelo;

public class ConvSameToSame implements LogicaServicio {

    @Override
    public Mtemperatura convertir(Mtemperatura MTemp) {
        MTemp.setValorResultado(MTemp.getValorEntrada());
        return MTemp;
    }

    public Mtemperatura aumentarTemperatura(Mtemperatura MTemp){
        MTemp.setValorResultado(MTemp.getValorEntrada()+1);
        MTemp.setUnidadResultado(MTemp.getUnidadEntrada());
        return MTemp;
    }
    public Mtemperatura disminuirTemperatura(Mtemperatura MTemp){
        MTemp.setValorResultado(MTemp.getValorEntrada()-1);
        MTemp.setUnidadResultado(MTemp.getUnidadEntrada());
        return MTemp;
    }
}
