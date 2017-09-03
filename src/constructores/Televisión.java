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
public class Televisión {
    private int encendido;
    private String Energy;
    private int chanel;
    private char apagar;
    /**
     * Constructor de tipo vacío o por default
     * @param vacío 
     */
    Televisión(){
        
    }
    /**
     * Constructor que pide parámetros, de tipo int
     * @param encendido
     */
    Televisión(int encendido){
        this.encendido= encendido;
    }
    /**
     * Constructor que pide parámetros, de tipo String
     * @param Energía
     */
    Televisión(String Energía){
        this.Energy = Energía;
        System.out.println("La televisión se ha encendido");
    }
    /**
     * Método para cambiar de canal 
     * @param canal
     * @return canal
     */
    public int chanel(int canal){
        this.chanel = canal;
        System.out.println("Se ha cambiado al canal:"+canal);
        return canal;
    }
    /**
     * Método para apagar la TV
     */
    public void apagar(){
        
        System.out.println("La TV se apagó ");
    }
}
