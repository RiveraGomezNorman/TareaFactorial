/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareafactorial;

import java.util.Scanner;

/**
 *
 * @author NORMAN
 */
public class TareaFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fac = 1;
        int numeroF;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numeroF = numero.nextInt();
        for (int i = numeroF; i > 0; i--) {
            System.out.println(fac);
            fac = fac * i;

        }
        System.out.println("El factorial de " + numeroF + " es: " + fac);
    }

}
