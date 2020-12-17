package MVP_ControladorSupervisado.Vista;


import MVP_ControladorSupervisado.Modelo.Unidades;
import MVP_ControladorSupervisado.Presentador.Presentador;

import java.awt.event.ActionEvent;


public class VTermometroConsola implements IVTermometro {
    private Presentador presenter;
    private Validacion validar = new Validacion();


    @Override
    public void setPresentador(Presentador p) {
        presenter=p;
    }
    @Override
    public void iniciar(){
        int op;
        do{
            menu();
            op = validar.inInt();
            switch (op){
                case 1:
                    presenter.aumentarTemperatura(new ActionEvent(this,
                            1,"AumentarTemp"));
                    break;
                case 2:
                    presenter.disminuirTemperatura(new ActionEvent(this,
                            2,"disminuirTemp"));
                    break;
                case 3:
                    System.out.println("DE:");
                    presenter.getvaloresIniciales();
                    System.out.println("A:");
                    presenter.convertir(new ActionEvent(this,
                            3,"convertir"));
                    break;
                case 4:
                    System.out.println("HASTA LA PROXIMAAAA!");
                    break;
                default:
                    System.out.println("OPCIONES ENTRE 1 Y 4");
                    break;
            }
        }while (op!=4);
    }
    @Override
    public double getValorTemperatura(){
        System.out.println("Ingrese Valor Temperatura");
        return validar.inDouble();
    }
    @Override
    public Unidades getUnidadTemperatura(){
        System.out.println("Ingrese Unidad Temperatura");
        return validar.inUnidad();
    }

    @Override
    public void setSalida(String valorResultante) {
        System.out.println("El Resultado es: "+valorResultante);
    }

    public void menu(){
        System.out.println("<------¿Que acción desea realizar?------>");
        System.out.println("1.- Aumentar Temperatura");
        System.out.println("2.- Disminuir Temperatura");
        System.out.println("3.- Convertir a otra Unidad");
        System.out.println("4.- Salir");
    }

}
