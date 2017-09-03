/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Diego
 * @version 1.0 2/09/2017
 */
public class Coche {
    private String gasolina;
    /**
     * Constructor que pide parámetros
     * @param gasolina El parámetro gasolina es necesario para que pueda crearse el objeto
     */
    Coche(String gasolina ){
        this.gasolina = gasolina;
    }
    /**
     * Método que sirve para arrancar el coche
     */
    public void arrancar(){
        System.out.println("El coche está funcionando");
    }
    /**
     * Método que sirve para acelerar el coche
     */
    public void acelerar(){
        System.out.println("El coche ha acelerado");
    }
    /**
     * Método que sirve para frenar
     */
    public void frenar(){
        System.out.println("El coche está frenando");
    }
    /**
     * Método que sirve para apagar
     */
    public void apagar(){
        System.out.println("El coche se ha apagado ");
    }
    /**
     * Método que sirve para ponerle más gasolina al coche 
     */
     public void gasolina(){
        System.out.println("Recarga de gsolina hecha");
    }
}
