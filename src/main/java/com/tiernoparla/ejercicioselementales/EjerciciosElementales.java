
package com.tiernoparla.ejercicioselementales;

import java.util.Scanner ;
import java.lang.Math;
import java.util.Random;
import java.util.regex.*; 
public class EjerciciosElementales {
    public static void main(String[] args){
     

    //Printear una matriz de numeros.
     /*
    
     int matriz[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
     
     for (int i = 0; i <matriz.length; i++){
         for (int j=0; j<matriz[i].length;j++){
            System.out.print(matriz[i][j]);
             }//for2
         System.out.println("");
           }//for1
     */
     /*   
     //matriz
     String[][] str_matrix ={
         {"a", "b", "c", "d"},
         {"e", "f", "g", "h"},    
         {"i", "j", "k", "l"}
    };//array
        System.out.println(str_matrix[1][2]);
     */   


    //contraseña valida
    /*
    String pass = "asdnsdadas2da";
    boolean pass_ok = true;
    
    //longitud 10
    if (pass.length()< 10){
        pass_ok = false;
    }
    
    //solo letras y nums

    if(! pass.matches ("^[a-zA-Z0-9]*$")){
        pass_ok = false;
    }
    //al menos 2 nums
        //for char in pass
            //if char regex == 0-9
              //count++
    
    int counter = 0;
    for (char c: pass.toCharArray()){
        if(Character.isDigit(c)){
            counter++;
        }//if
    }//for
    //if counter < 2 --> pass_ok = false
    if (counter <2){
        pass_ok = false;
    }
    
    if(pass_ok){
        System.out.println("el password esta ok");
    } else {
        System.out.println("el password esta mal");
    }
        
    */    
        
    /*
     int N = 1234;
     int result = 0;
      while (N > 0){
          result += N % 10;
          N = N / 10;
      }//while
        System.out.println("La suma es: " + result);
    */    
    /*  //contar las palabras de una frase.
        String str = "   Salimos   dasdas   dasdasd   das   ";
        str = str.trim();
        String[] palabras = str.split("\\s+");
        System.out.println(palabras.length);
    */ 
    
    
    
    /*    //hacer que cuente las vocales de la palabra.
        String str = "Tatiana";
        System.out.println("El numero de valores que hay es: " + str.length());
        int contador = 0;
        for (int i = 0; i < str.length(); i++){
            if ((str.charAt(i)=='a') || (str.charAt(i)=='e') || 
                (str.charAt(i)=='i') || (str.charAt(i)=='o') || 
                (str.charAt(i)=='u')){
                contador ++;
            }//if
        }//for||
        System.out.println("La palabra " + str + " contiene " + contador + 
        " vocales ");
    */
        
        
        
        
        
        //comprobar si el numero de letras es impar o par y sacar el medio.
        /*
        String str = "Sol";
        System.out.println("El numero de valores que hay es: " + str.length());
        int y = str.length() / 2 ;
        int z = y - 1;
        int x = y + 1;
        
        if (str.length() % 2 == 0){
            System.out.println(str + " es par y las dos letras del medio son:" + (str.substring (z, x)));
        }//if
        else {
            System.out.println(str + " es impar y la letra del medio es: " + str.charAt(y));
        }//else
        */
        
        /*
        //encontrar los dos valores del medio par.
        String str = "aBCd";
        System.out.println("El numero de valores que hay es:" + str.length());
        int y = str.length() / 2 ;
        int z = y - 1;
        int x = y + 1;
        System.out.println("Por lo tanto la letra del medio es " + (str.substring (z, x)));
        */
        
        
        
        //encontrar el valor del medio de un string impar
                /*
        String letras = "Tatiana";
        System.out.println("El numero de valores que hay es:" + letras.length());
        int n = letras.length();
        int y = n / 2 ;
        System.out.println("Por lo tanto la posicion es la : " + y);
        System.out.println("Por lo tanto la letra del medio es " + letras.charAt(y));
           */     
        
        
        /*
        
        
        //Como calculas la media.
        //1º Sumar elementos del array.
        //Contar cuantos hay (Sin usar .length)
        //Calcular media 
                //arr.hasNext() te da true si hay mas elementos en el array y false si no hay mas
                //arr.next() te saca el primer elemento.
        
        int [] nums = {1, 2, 3, 4,};
        double media = 0.0;
        
        double suma2 = 0;
        //HAcerlo con foreach
       
        for(double x: nums){
            suma2 += x;
        }//foreach
        suma2 = suma2 / nums.length;
        System.out.println(suma2);
        //hacer con for solo
        
        for (int i=0; i < nums.length; i++){
            media = media + nums[i];           
        }//for
            media = media / nums.length;
         System.out.println("La media de nums es:" + media);
         */
         
        /*
        //Dados N numeros, cual es el menor/mayor de todos.
        int[] lista = {1, -7, 47, -2};
        int min = lista[0];//le ponemos que min es el primer valor del array para luego ir actualizandolo.
        for ( int i = 1 ; i < lista.length; i++){
            //ponemos i = 1 porque la posicion 0 ya la usamos en en min.
            if ( min  > lista[i]){
                min = lista[i];
            }//if
            else{
                //no se ejecutara porque no hay opcion de false.
                min = min;
            }//else
             
        
        }//for
        System.out.println("el minimo es: " + min);
        */
        
        /*
        //Forma de sacar 4 numeros cifra por cifra.
            //forma de hacerlo paso a paso
        int N = 1435;
        
        System.out.println(N%10);//primera cifra
        System.out.println((N/10)%10);//segunda cifra
        System.out.println(((N/10)/10)%10);//tercera cifra
        System.out.println((((N/10)/10)/10)%10);//cuarta cifra
        */
        
        /*
       //calcular y guardar todos los terminos de fibonacci hasta el N.
        //Tengo N (ponemos el numero que queramos, es el limite)
        int N=5;
        //Defino un array de tamaño N
        int[] Fib = new int [N];
        //Guardo los 2 primeros terminos.
        Fib[0] = 1;
        Fib[1] = 1;
        //Loop para calcular y guardar los siguientes terminos hasta N
            //A la i se le da valor de 2 porque la siguiente posicion que queremos saber es la 2
        for (int i = 2; i < N; i++){
            //se pone Fib [i-1] ya que el 1 es la posicion que queremos y para conseguirlo necesitamos las posiciones anteriores.
            Fib[i] = Fib[i-1] + Fib[i-2];
           }//for
        for (int i = 0; i < Fib.length; i++){
        
        System.out.println(Fib[i]);
        
           }//2for
        */
        
        
        
        
        
        /*

        // Carlcular termino N de fibonacci con arrays en vez de x1, x2 y fib
            //1ºdeclaramos el array de tamaño 3 int
            //2º declaramos el array con (x1 =1, x2 = 1, fib)
            int[] Fib = {1,1,0};
            int N= 5;
            //3º hago el for --> pero donde estaba Fib ahora en calcular
            for (int i=3; i<=N; i++){
                Fib[2] = Fib[1] + Fib[0];
                Fib[0] = Fib[1];
                Fib[1] = Fib[2];
            }//for
            
        
        
        System.out.println(Fib[2]);
        */
        
        
        
        //termino N de la sucesion de Pibonacci
       /*
        int N = 5;
        int x1 = 1;
        int x2 = 1;
        
        for (int i = 3; i <=N; i++){
           
        System.out.println(i);
        }//for
        //calculado una vez
        */
        /*
        int x3 = x2 + x1;
        int x4 = x3 + x2;
        int x5 = x4 + x3;
       
        System.out.println(x5);
        */
        //arrays
        /*
        String[] palabras = {"hola", "adios"};
        System.out.println(palabras[0]);
        System.out.println(palabras[1]);
        */
        //recursividad
        
        
        
        
        
        
        
        
        
        /*
        Scanner sc = new Scanner (System.in);
        
        //Algoritmo division
        int n ;
        System.out.println("Dame valor n");
        n = sc.nextInt(); //la n lo definira el usuario al ejecutarlo.
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
        
        */
        
        
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
