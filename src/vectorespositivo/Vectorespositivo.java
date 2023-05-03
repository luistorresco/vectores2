/*Hacer un programa que lea un vector de tamaño N de números enteros, 
debe imprimir los números positivos en posiciones impares
 */
package vectorespositivo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author luistorresco
 */
public class Vectorespositivo {

    /**
     * @param args 
     */
    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objread=new Scanner(System.in);
        Random rnd=new Random();
        int n,cont=0;
        //Ingrese cantidad de elementos del vector
        System.out.print("¿Cuantos elementos tiene el vector? ");
        n=objread.nextInt();
        //declaracion vector
        int[] numeros=new int[n];
        for (int i = 0; i < n; i++) {
            //Lectura de los elementos del vector
            numeros[i]=rnd.nextInt(20);
            if (numeros[i] > 10)
                cont++;
        }
        //Verificacion
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + "  ");
        }
        System.out.println("\n La cantidad de numeros mayores de 10 es " + cont);
    }
}
