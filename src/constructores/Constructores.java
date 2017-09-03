/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import java.util.Scanner;

/**
 *
 * @author Diego
 * @version 1.0 2/09/2017
 */
public class Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char opc;
        String another = " ";
        int canal;
        Scanner teclado = new Scanner(System.in);
        int hacer;
        do {
            System.out.println("¿Qué deseas utilizar?");
            System.out.println("a) Un coche");
            System.out.println("b) Una Televisión ");
            System.out.println("s) Salir");
            opc = teclado.nextLine().charAt(0);
            while (opc == 'A' || opc == 'a') {
                another = "n";
                while (another.equalsIgnoreCase("n")) {
                    /**
                     * Se crea el objeto cochesito y el constructor lo inicializa
                     */
                    Coche cochesito = new Coche("Magna");
                    cochesito.arrancar();
                    System.out.println("¿Qué más deseas hacer?");
                    System.out.println("1. Frenar");
                    System.out.println("2. Acelerar");
                    System.out.println("3. Apagar");
                    System.out.println("4. Más gasolina");
                    hacer = teclado.nextInt();

                    if (hacer == 1) {
                        cochesito.frenar();
                    } else {
                        if (hacer == 2) {
                            cochesito.acelerar();
                        } else {
                            if (hacer == 3) {
                                cochesito.apagar();
                            } else {
                                if (hacer == 4) {
                                    cochesito.gasolina();
                                }
                            }
                        }
                    }
                    System.out.println("¿Desea usar otra cosa?");
                    teclado.nextLine();
                    another = teclado.nextLine();

                }
                System.out.println("¿Qué deseas utilizar?");
                System.out.println("a) Un coche");
                System.out.println("b) Una Televisión ");
                System.out.println("s) Salir");
                opc = teclado.nextLine().charAt(0);
            }

            while (opc == 'b' || opc == 'B') {
                do {
                    /**
                     * Dependiendo de los argumentos que se ingresen,
                     * será el constructor que se utilizará para inicializar el objeto
                     * Pueden tenerse varios constructores a la vez, se inicializa un objeto
                     * con el que se llame primero. Pero sólo puede utilizarse un constructor por objeto
                     */
                    Televisión tv = new Televisión();
                    Televisión tv1 = new Televisión("AC");
                    Televisión tv2 = new Televisión(1);
                    System.out.println("¿Qué más deseas hacer?");
                    System.out.println("1. Cambiar canal");
                    System.out.println("2. Apagar");
                    hacer = teclado.nextInt();
                    if (hacer == 1) {
                        System.out.println("¿Qué canal");
                        canal = teclado.nextInt();
                        tv1.chanel(canal);
                    } else {
                        if (hacer == 2) {
                            tv1.apagar();
                        }
                    }
                    System.out.println("¿Desea usar otra cosa?");
                    teclado.nextLine();
                    another = teclado.nextLine();

                } while (another.equalsIgnoreCase("n"));
                System.out.println("¿Qué deseas utilizar?");
                System.out.println("a) Un coche");
                System.out.println("b) Una Televisión ");
                System.out.println("s) Salir");
                opc = teclado.nextLine().charAt(0);

            }

        } while (opc == 'a' || opc == 'b');
    }

}
