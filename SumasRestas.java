/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumasrestas;

import java.util.Scanner;

/**
 *
 * @author Carlos Saca
 */
public class SumasRestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //En este programa se calcula la suma y resta de dos números  
        menu();

        }

// Este método es para la suma
        public static void menu() {
            Scanner menu = new Scanner(System.in);
            int opción;

            do {
                System.out.println("1. Suma");
                System.out.println("2. Resta");

                opción = menu.nextInt();
                switch (opción) {
                    case 1:
                        suma();
                        break;
                    case 2:
                        resta();
                        break;
                    case 3:
//                        salir();
                        break;
                }
            } while (opción != 3);


        }
// método suma
        public static void suma() {
            Scanner suma = new Scanner(System.in);
            int a, b;

            System.out.println("Teclea número 1");
            a = suma.nextInt();
            System.out.println("Teclea número 2");
            b = suma.nextInt();
            System.out.println("La suma es: " + (a + b) + "\n");
        }
// método resta
        public static void resta() {
            Scanner resta = new Scanner(System.in);
            int c, d;

            System.out.println("Teclea número 1");
            c = resta.nextInt();
            System.out.println("Teclea número 2");
            d = resta.nextInt();
            System.out.println("La resta es: " + (c - d) + "\n");
        }
    }