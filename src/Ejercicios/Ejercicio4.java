package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        4. Generar un número aleatorio comprendido entre 0 y 1000. Pedir, a continuación, al
        usuario adivinar el número escogido por el ordenador. Para ello, debe introducir un
        número comprendido entre 0 y 1000. Se compara el número introducido con el
        calculado por el ordenador y se muestra en la consola "es mayor" o "es menor" en
        función del caso. Se repite la operación hasta que el usuario encuentra el número.
        */
        
        //Creamos un numero random usando la clase Random
        //Creamos el Scanner
        Random numRandom = new Random();
        Scanner sc = new Scanner(System.in);
        
        //Creamos las variables a utilizar
        int num = numRandom.nextInt(1000);
        int numero = 1001;
        
        
        
        //El bucle se ejecuta mientras el numero ingresado sea distinto del numero aleatorio generado
        while(numero != num){
            System.out.println("Ingrese un numero entre el 1 y 1000");
            numero = sc.nextInt();
            
            //Si el numero es mayor al numero ingresado mostramos un mensaje
            //De ser menor mostramos el mensaje contrario
            if(numero > num){
                System.out.println("El numero que busca es menor a " + numero);
            }
            else if(numero < num){
                System.out.println("El numero que busca es mayor a " + numero);
            }
        }
        
        //Al finalizar el programa mostramos un mensaje con el numero
        System.out.println("Ah encontrado el numero!!");
        System.out.println("El numero era: " + num);


    }
}
