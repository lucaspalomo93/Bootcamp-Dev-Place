package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        
        /*
        5. Pedir al usuario que ingrese un número repetidamente hasta que ingrese un -1 y en ese
        caso se terminará el programa.
        Al terminar, mostrará lo siguiente:
        a. – mayor número introducido
        b. – menor número introducido
        c. – suma de todos los números
        d. – suma de los números
        */
        
        //Creamos el Scanner y las variables
        Scanner sc = new Scanner(System.in);
        int numero, numeroMayor, numeroMenor, sumaTotal = 0, contNumeros = 0;
        
        //Ingresamos un primer numero y lo igualamos a numero mayor y menor
        //Tambien sumamos el total y aumentamos el contador
        System.out.println("Ingrese un numero para inciar, -1 cierra el programa: ");
        numero = sc.nextInt();
        numeroMayor = numero;
        numeroMenor = numero;
        sumaTotal += numero;
        contNumeros ++;

        
        //Mientras que el numero ingresado sea distinto de '-1' se seguira ejecutando el programa
        while(numero != -1){
            
            //Pedimos al usuario que nuevamente ingrese un numero
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
            
            //Si el numero ingresado es mayor al numeroMayor, le asignamos el valor a la variable
            //En caso de que sea menor lo hacemos con la variable de numeroMenor
            if(numero > numeroMayor){
                numeroMayor = numero;
            }
            else if(numero < numeroMenor && numero != -1){
               numeroMenor = numero; 
            }
            
            //Sumamos el numero a la sumaTotal
            //Aumentamos el contador
            sumaTotal += numero;
            contNumeros++;
        }
        
        //Mostramos todos los valores por pantalla
        System.out.println("Numero Mayor: " + numeroMayor);
        System.out.println("Numero Menor: " + numeroMenor);
        System.out.println("Suma Total: " + sumaTotal);
        System.out.println("Total de cantidad de numeros ingresados: " + contNumeros);
        
    }
}
