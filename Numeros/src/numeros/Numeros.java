/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.*;

/**
 *
 * @author Usuario DAM 1
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static Boolean esPrimo(int numero) {
        Boolean Primo = true;
        if (numero < 2) {
            Primo = false;
        } else {
            for (int x = 2; x * x <= numero; x++) {
                if (numero % x == 0) {
                    Primo = false;
                    break;
                }
            }
        }
        return Primo;
    }

    public static void main(String[] args) {
        int numeros[][] = new int[2][10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            numeros[0][i] = i;
            System.out.print("Introduzca elemento " + i + ": ");
            numeros[1][i] = sc.nextInt();
        }

        System.out.println("El array es: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[0][i] + "   ");
        }

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[1][i] + "  ");
        }

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (esPrimo(numeros[1][i]) == true && esPrimo(numeros[1][j]) == false) {
                    int aux = numeros[1][i];
                    numeros[1][i] = numeros[1][j];
                    numeros[1][j] = aux;
                }
            }
        }
        
        System.out.println("El array con los primos primero es: ");
        for(int i=0; i<10; i++){
            System.out.print(i+" ");
        }
        
        System.out.println("");
        
        for(int i=0; i<10; i++){
            System.out.print(numeros[1][i]+" ");
        }
    }

}
