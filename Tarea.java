/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Tarea {
Scanner ingresar = new Scanner(System.in);

 
        
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Introduce el primer número:");
        numero1 = ingresar.nextInt();

        System.out.println("Introduce el segundo número:");
        numero2 = ingresar.nextInt();
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double Division = numero1 / numero2;
        
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicacion es "+multiplicacion);
        System.out.println("La Division es "+Division);
        
         
    }
    
}
