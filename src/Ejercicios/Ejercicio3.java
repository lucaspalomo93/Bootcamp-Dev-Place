package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        /*
        3. Por teclado se ingresa el valor hora de un empleado. Posteriormente se ingresa el
        nombre del empleado, la antigüedad y la cantidad de horas trabajadas en el mes. Se
        pide calcular el importe a cobrar teniendo en cuenta que al total que resulta de
        multiplicar el valor hora por la cantidad de horas trabajadas. Además, si el empleado
        tiene más de 10 años de antigüedad hay que sumarle la cantidad de años trabajados
        multiplicados por $30. Imprimir en pantalla el nombre, la antigüedad y el total a cobrar.
         */
        
        
        //Creamos todas las variables
        float valorHora, importeACobrar;
        String nombre = " ";
        int antiguedad, cantHorasTrabajadas;
        Scanner sc = new Scanner(System.in);
        
        
        //Pedimos al usuario que ingrese todos los datos
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();
        

        System.out.println("Ingrese el valor hora del empleado: ");
        valorHora = sc.nextFloat();

 

        System.out.println("Ingrese los años de antiguedad del empleado: ");
        antiguedad = sc.nextInt();

        System.out.println("Ingrese la cantidad de horas trabajadas en el mes: ");
        cantHorasTrabajadas = sc.nextInt();
        
        //Mostramos el resultado
        //En el total a cobrar llamamos a la funcion calculoTotal y le pasamos como parametros los datos ingresados
        System.out.println("Nombre: " + nombre);
        System.out.println("Antiguedad: " + antiguedad);
        System.out.println("Total a cobrar: " + calculoTotal(valorHora, antiguedad, cantHorasTrabajadas));

    }

    
    //Esta funcion admite como parametros el valorHora, la antiguedad y la cantidad de horas trabajadas
    //Retorna un flotante dependiendo de la antiguedad del empleado
    public static float calculoTotal(float valorHora, int antiguedad, int cantHorasTrabajadas) {
        float totalAntiguedad = antiguedad * 30;
        float valorHorasTrabajadas = valorHora * cantHorasTrabajadas;

        if(antiguedad > 10){
            return totalAntiguedad + valorHorasTrabajadas;
        }
        else{
            return valorHorasTrabajadas;
        }

    }
}
