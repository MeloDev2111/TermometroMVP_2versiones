package MVP_VistaPasiva.Vista;

import MVP_VistaPasiva.Modelo.Unidades;

import java.util.Scanner;

public class Validacion {
    private Scanner in = new Scanner(System.in);

    public double inDouble(){
        double entrada = 0.0;
        boolean valido = false;
        do {
            in = new Scanner(System.in);//MODI
            try {
                entrada = in.nextDouble();
                valido = true;
            }catch (Exception e){
                this.mostrarError("Double");//MODIFICACION
            }
        }while (!valido);
        return entrada;
    }
    public int inInt(){
        int entrada = 0;
        boolean valido = false;
        do {
            in = new Scanner(System.in);//MODI
            try {
                entrada = in.nextInt();
                valido = true;
            }catch (Exception e){
                this.mostrarError("Entero");
            }
        }while (!valido);
        return entrada;
    }

    public Unidades inUnidad(){
        Unidades unidad = null;
        boolean valido = false;
        do {
            String entrada = in.next();
            if (entrada.length() != 1) {
                this.mostrarError("caracter");
            }else {
                for (Unidades u:Unidades.values()) {
                    if (u.getCaracter()==entrada.charAt(0)){
                        unidad = u;
                    }
                }

                if (unidad==null) {
                    this.mostrarError("F o C o K");
                }
            }

            if (unidad!=null) {
                valido = true;
            }

        } while (!valido);

        return unidad;
    }

    private void mostrarError(String formato){
        System.out.println("Error de Formato.. "+
                "Ingrese un valor con formato: " + formato + "\n" );
    }
}
