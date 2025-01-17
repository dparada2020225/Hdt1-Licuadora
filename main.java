import java.util.*;

/*
 * Universidad del Valle de Guatemala
 * Autora: Marco Alejandro Díaz Castañeda
 * Carnet: 24229
 * Fecha de inicio: 19/01/2025
 * Fecha de finalización: 20/01/2025
 * Descripción: Clase principal del programa donde recibira las entradas y salidas, tomara decisiones para poder empezar el probgrama de la licuadora
 *
*/

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Licuadora blender = new Licuadora(false, false, 0);
        Boolean flag = false;
        if (blender.getEncendido() == false) {
            System.out.println("Desea conectar la super licuadora? \n1.si \n2.no");
            try {
                int ans = keyboard.nextInt();
                if (ans == 1) {
                    flag = true;
                } else {
                    System.out.println("Ingrese un número válido");
                }
            } catch (Exception InputMissMatchException) {
                System.out.println("Ingrese solo el número");
            }
        }
        while (flag) {
            System.out.println("\n1.Llenar o vaciar licuadora\n2.Encender o Apagar la licuadora\n3.Consultar Encendido o apagado\n4.Consultar llenado\n5.Aumentar velocidad(max 10)\n6.Consultar velocidad\n7.Desconectar Licuadora");
            try {
                int menu = keyboard.nextInt();
                switch (menu) {
                    case 1:
                        boolean blenderState = blender.consultarLlenado();
                        if (blenderState == false) {
                            blender.llenar();
                            System.out.println("Ahora su licuadora está llena");
                        } else {
                            blender.vaciar();
                            System.out.println("Ahora su Licuadora está vacía");
                        }
                        break;
                    case 2:
                        boolean onOff = blender.getEncendido();
                        if (blender.getLleno() == true) {
                            if (onOff == false) {
                                System.out.println("Ahora su licuadora esta encendida en velocidad 1");
                                blender.aumentarVelocidad();
                                blender.encender();
                            } else {
                                System.out.println("Ahora su Licuadora está apagada");
                                blender.setVelocidad(0);
                                blender.setEncendido(false);
                            }
                        } else {
                            System.out.println("La licuadora no está llena, no se puede encender si no esta llena.");
                        }
                        break;
                    case 3:
                    String textOnOff="";
                        if(blender.getEncendido()){
                            textOnOff= "encendido";
                        }
                        else{
                            textOnOff= "apagado";

                        }
                        System.out.println("su licuadora está: "+textOnOff);
                        break;
                    case 4:
                    String textFullEmpty="";
                    if(blender.consultarLlenado()){
                        textFullEmpty= "llena";
                    }
                    else{
                        textFullEmpty= "vacía";

                    }
                        System.out.println("su licuadora esta actualmente: " +textFullEmpty);
                        break;
                    case 5:
                        if(blender.getEncendido()){
                            blender.aumentarVelocidad();
                            if (blender.getVelocidad()>=10){
                                System.out.println("Ha alcanzado la velocidad máxima de 10.");
                            }else{
                                System.out.println("Ha aumentado la velocidad, su nueva velocidad es de " + blender.getVelocidad());
                            }
                        }else{
                            System.out.println("su licuadora está apagada encenderla primero");
                        }
                    
                        break;
                    case 6:
                        if(blender.getEncendido()){
                            System.out.println("la velocidad actual es "+ blender.getVelocidad());
                        }else{
                            System.out.println("Su licuadora no está encendida...");
                        }
                        break;
                    case 7:
                        System.out.println("Desconectando su licuadora");
                        blender.vaciar();
                        blender.setEncendido(false);
                        blender.setVelocidad(0);
                        flag=false;
                        break;
                    default:
                        System.out.println("Selecciona un número válido");
                        break;

                }

            } catch (Exception InputMissMatchException) {
                System.out.println("Ingrese solo el número");
            }

        }
        keyboard.close();
    } 
}
