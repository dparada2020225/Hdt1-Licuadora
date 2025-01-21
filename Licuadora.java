/*
 * Universidad del Valle de Guatemala
 * Autora: Tiffany Salazar Suarez
 * Carnet: 24630
 * Fecha de inicio: 17/01/2025
 * Fecha de finalización: 18/01/2025
 * Descripción: La clase licuadora se encarga de gestionar todos los métodos
 *              y atributos relacionados con la licuadora implementando la interface Interfaz.
*/
public class Licuadora implements Interfaz{
    /**
     *Atributos de encendido, lleno y velocidad de la licuadora.
     */
    private boolean encendido;
    private boolean lleno;
    private int velocidad; 

    /*
     * Método constructor de la licuadora
     */
    public Licuadora(boolean encendido, boolean lleno, int velocidad) {
        this.encendido = encendido;
        this.lleno = lleno;
        this.velocidad = velocidad;
    }

    /*
     * Método implementado que enciende la licuadora
     */
    @Override
    public void encender(){
        encendido = true;
    }

    /*
     * Método implementado para llenar la licuadora
     */
    @Override
     public void llenar(){
        lleno = true;
    }

    /*
     * Método implementado para aumentar velocidad de licuadora en una unidad
     */
    @Override
    public void aumentarVelocidad(){
        if (velocidad <= 9){
            velocidad++;
        }
    }

    /*
     * Método implementado encargado de retornar el valor entero guardado en velocidad
     */
    @Override
    public int consultarVelocidad(){
        return velocidad;
    }

    /*
     * Método implementado que se encarga de retornar el estado, por medio true y false, del llenado;
     * True: lleno
     * False: vacio
     */
    @Override
    public boolean consultarLlenado() {
        return lleno;
    }

    /*
     * Método implementado encargado de cambiar el estado de lleno en la licuadora por un false.
     */
    @Override
    public void vaciar() {
        lleno = false;
    }  

    /*
     * Métodos Get y Set para cada atributo de licuadora
     */
    public boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean getLleno() {
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
