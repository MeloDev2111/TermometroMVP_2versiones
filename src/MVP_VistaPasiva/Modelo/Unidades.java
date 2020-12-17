package MVP_VistaPasiva.Modelo;

public enum Unidades {
    CELSIUS('F'), FAHRENHEIT('C'), KELVIN('K');

    private char caracter;

    Unidades (char c){
        this.caracter=c;
    }

    public char getCaracter(){
        return this.caracter;
    }
}
