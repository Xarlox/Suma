/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumasrestas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Carlos Saca
 */
public class TablasSRMD {

    /*
     * To change this template, choose Tools | Templates
     * and open the template in the editor.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        int opc = 0;
        System.out.println("Ingrese el numero de la opercion que desee");
        System.out.println("\n " + 1 + " si es Suma"
                + "\n " + 2 + " Si es Resta"
                + "\n " + 3 + " Si es Multiplicacion"
                + "\n " + 4 + " si es Divicion");
        opc = Integer.parseInt(lectura.readLine());

        switch (opc) {
            case 1:
                Suma();
                break;
            case 2:
                Resta();
                break;
            case 3:
                Multiplicacion();
                break;
            case 4:
                Division();
                break;
            default:
                System.out.println("Ingresar un numero entre 1&3");
        }
    }

    public static void Suma() throws IOException {
        BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Programa para calcular tablas de Sumar");
        System.out.println("Ingresar el numero deseado");
        int Numero = Integer.parseInt(lectura1.readLine());
        System.out.println("Tabla del " + Numero + "");
        respSuma(Numero, 0);
    }

    static void respSuma(int H, int Contador) {
        Contador++;
        if (Contador <= 10) {
            int resp = Contador + H;
            System.out.println(H + "+" + Contador + "=" + resp);
            respSuma(H, Contador);
        }
    }

    public static void Resta() throws IOException {
        BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Programa para calcular tablas de Restar");
        System.out.println("Ingresar el numero deseado");
        int Numero = Integer.parseInt(lectura1.readLine());
        System.out.println("Tabla del " + Numero + "");
        respResta(Numero, 0);

    }

    static void respResta(int H, int Contador) {
        Contador++;
        if (Contador <= 10) {
            int resp = H - Contador;
            System.out.println(H + "-" + Contador + "=" + resp);
            respResta(H, Contador);
        }
    }

    public static void Multiplicacion() throws IOException {
        BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Programa para calcular tablas de multiplicar");
        System.out.println("Ingresar el numero deseado");
        int Numero = Integer.parseInt(lectura1.readLine());
        System.out.println("Tabla del " + Numero + "");
        respMult(Numero, 0);

    }

    static void respMult(int H, int Contador) {
        Contador++;
        if (Contador <= 10) {
            System.out.println(H + "x" + Contador + "=" + Contador * H);
            respMult(H, Contador);
        }
    }

    public static void Division() throws IOException {
        BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Programa para calcular tablas de Dividir");
        System.out.println("Ingresar el numero deseado");
        int Numero = Integer.parseInt(lectura1.readLine());
        System.out.println("Tabla del " + Numero + "");
        respDiv(Numero, 0);
    }

    static void respDiv(int H, int Contador) {
        Contador++;
        if (Contador <= 10) {
            double resp = H / Contador;
            System.out.println(H + "/" + Contador + "=" + resp);
            respDiv(H, Contador);
        }
    }
}