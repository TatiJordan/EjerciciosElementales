
package com.tiernoparla.ejercicioselementales;

import java.util.Scanner ;

public class EjerciciosElementales {
    public static void main(String[] args){
       
        Scanner sc = new Scanner (System.in);
        
        
        //Algoritmo division
        int n ;
        System.out.println("Dame valor n");
        n = sc.nextInt();
        int d ;
        System.out.println("Dame valor d");
        d = sc.nextInt();
        System.out.println("Resultado");
        int r = n;
        int q = 0;
        while ( r >= d ) {
            System.out.println(r);
            r = r - d;
            System.out.println(r);
            q++;
        }//while
        
        System.out.println(n == d*q+r);
        //Comprobacion de la division.
        
        
        
        
        
        
        /*
        //printear nums pares del 1 al 10 3 forma 
        int n = 1;
        while( n < 11 ) {
            if (n%2 == 0){
                System.out.println(n);
            }//if
            n++;
        }//while
        */
        
        
        
        
        /*
        //listar los numeros entre el 0 y antes del 11.
        int n = 0;
        while (n < 11) {
            System.out.println(n);
            n++;
        }//while
        */
        
        
        
        
        
        /*
        //printear nums pares del 1 al 10 2 forma
        for (int i = 1; i <= 10; i++){
             if(i%2 == 0) {
                 System.out.println(i);
             }//if
        }//for 2 forma
        */
        
        
        
        
        
        
        
        /*
        // printear nums pares del 1 al 10 con for 
        for (int i = 2; i < 11; i=i+2){
            System.out.println(i);
        }// for    
        */
        
        
    }//main
}//ejercicios elementales
