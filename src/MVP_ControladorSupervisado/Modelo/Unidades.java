package MVP_ControladorSupervisado.Modelo;

public enum Unidades {
        CELSIUS('C'), FAHRENHEIT('F'), KELVIN('K');

    private char caracter;

    Unidades (char c){
        this.caracter=c;
    }

    public char getCaracter(){
        return this.caracter;
    }
}
