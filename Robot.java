/**
 * Clase que simula el comportamiento de un robot
 * @author Ana Flores
 * @version Robot.1
 */
public class Robot {
    private String nombre;
    private String marca;
    private String numSerie;
    private boolean estaDormido;

    /**
     * Se especifica el nombre del robot, la marca y el numero de serie
     */
    public Robot () {
        nombre = "Robotina";
        marca = "Hasbro";
        numSerie = "Rob2011";
    }
    /**
     * Constructor 
     * @param n - nombre del robot
     * @param m - marca del robot
     * @param num - número de serie del robot
     */
    public Robot (String n, String m, String num) {
        nombre = n;
        marca = m;
        numSerie = num;
    }//end constructor
    /**
     * Método para asignar nombre al robot
     * @param nomb -- cadena con el nombre del robot
     */
    public void asignarNombre(String nomb) {
        nombre = nomb;
    }//end método asignarNombre
    /**
     * Método para asignar marca al robot
     * @param marca -- cadena con la marca del robot
     */
    public void asignarMarca(String marca) {
        this.marca = marca;
    }//end método asignarMarca
    /**
     * Método para asignar numSerie al robot
     * @param num -- cadena con el numero de serie del robot
     */
    public void asignarNumSerie(String num) {
        numSerie = num;
    }//end método asignarNumSerie
    /**
     * Método para obtener el nombre del robot
     * @return String -  nombre del robot
     */
    public String obtenerNombre() {
        return nombre;
    }//end método obtenerNombre
    /**
     * Método para obtener la marca del robot
     * @return String -  marca del robot
     */
    public String obtenerMarca() {
        return marca;
    }//end obtenerMarca
    /**
     * Método para obtener el número de Serie del robot
     * @return String -  número de serie del robot
     */
    public String obtenerNumSerie() {
        return numSerie;
    }//end método obtenerNumSerie
    /** 
     * Método para hacer dormir al robot
     */
    public void dormir() {
        if(!estaDormido) {
            estaDormido = true;
        }//end if
    }//end método dormir
    /** 
     * Método para despertar al robot
     */
    public void despertar() {
        if(estaDormido) {
            estaDormido = false;
        }//end if
    }//end método despertar
    /**
     * Método para saber si el robot está despierto
     * @return boolean -- Si es true el robot está despierto y false si esta dormindo
     */
    public boolean estaDespierto() {
        return !estaDormido;
    }//en método estaDespierto
    /**
     * Método para que el robot repita lo que se le dice
     * @param rollo -- cadena con el rollo que se desea repita el robot
     */
    public void repetir(String rollo) {
        System.out.println(rollo);
    }//end método repetir
    /**
     * Método para determinar si dos robots son iguales
     * @param robot -- robot con el que se va a comparar
     * @return boolean -- true si son iguales y false en otro caso.
     */
    public boolean equals (Robot robot) {
        if(this.nombre == robot.obtenerNombre() && this.marca == robot.obtenerMarca() && numSerie == robot.obtenerNumSerie()) {
            return true;
        }//end if
        return false;
    }//end método equals
    /**
     * Método para devolver una cadena con el nombre del robot.
     * @return String -- cadena que devolvera
     */
    public String toString () {
        return "Nombre: " + this.nombre + "\n";
    }//end método toString

    /**
     * Método para que el robot reste los números que se le dan
     * @param num1 -- minuendo
     * @param num2 -- sustraendo
     */
    public void restar(long num1, long num2) {
        System.out.println("" + (num1 - num2));
    }//end método restar
    /**
     * Método para que el robot sume los números que se le dan
     * @param num1 -- primer sumando
     * @param num2 -- segundo sumando
     */
    public void sumar(long num1, long num2) {
        System.out.println("" + (num1 + num2));
    }//end método sumar

    /**
     * Método para que el robot multiplique los números que se le dan
     * @param num1 -- primer factor
     * @param num2 -- segundo factor
     */
    public void multiplicar(long num1, long num2) {
        System.out.println("" + (num1 * num2));
    }//end método multiplicar
    /**
     * Método para que el robot divida los números que se le dan
     * @param num1 -- dividendo
     * @param num2 -- divisor
     */
    public void dividir(long num1, long num2) {
        
        if(num2 != 0){
           System.out.println("" + (num1 / num2)); 
        } //end if
    }//end método dividir        
}//end robot
