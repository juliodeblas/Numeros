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

        int primos = 0;
        for (int i = 0; i < numeros.length; i++) {
            int sumatorio = 0;
            for (int j = 1; j <= numeros[1][i]; j++) {
                if (numeros[1][i] % j == 0) {
                    sumatorio++;
                }
            }

            if (sumatorio == 2) {
                System.out.print(i + " ");
                primos++;
            }
        }

    }

}
