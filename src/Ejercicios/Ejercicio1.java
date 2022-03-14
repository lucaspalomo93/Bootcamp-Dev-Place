package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        /*1. Pide un número por teclado e indica si es un número primo o no. Un número primo es
        aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que
        25 es divisible entre 5, sin embargo, 17 si es primo.
         */
        
        
        //Creamos dos variables de tipo entero
        //La variable 'numero' almacena el valor ingresado por el usuario
        //La variable cont sirve como contador
        int numero = 0, cont = 0;

        //Creamos el scanner para ingresar datos por teclado
        Scanner sc = new Scanner(System.in);

        //Pedimos el dato al usuario y lo leemos con la clase scanner
        //Lo guardamos en la variable numero
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        //Con un bucle for, recorremos todos los numeros desde el 1 hasta llegar al numero ingresado
        //Con un if nos fijamos si el modulo del numero ingresado dividido el valor de i es igual a 0
        //Si es igual a 0 aumentamos el valor de contador
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont++;
            }
        }

        //Preguntamos si cont es mayor a 2, si es asi significa que el numero es divisible por más de dos numeros.
        //Por ende no es primo.
        //Y con un else mostramos el mensaje de que si es un numero primo.
        if (cont > 2) {
            System.out.println("El numero ingresado NO es primo");
        } else {
            System.out.println("El numero ingresado ES un numero primo");
        }
    }
}
