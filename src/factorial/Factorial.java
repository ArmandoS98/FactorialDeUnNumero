/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author asantos
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        int factorial = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Seleccina el numero a calcular el factorial: ");
        numero = input.nextInt();
        
        for (int i = 1; i <= numero; i++)
            factorial *= i;
        
        System.out.println("El factorial de " + numero + " es = " + factorial);
    }
    
}
