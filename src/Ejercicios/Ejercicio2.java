package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        /*
        2. Escribe una aplicación que solicite al usuario que ingrese una contraseña cualquiera.
        Después se le pedirá que ingrese nuevamente la contraseña, con 3 intentos. Cuando
        acierte ya no pedirá más la contraseña y mostrará un mensaje diciendo “Felicitaciones,
        recordás tu contraseña”. Si falla luego de 3 intentos se mostrará el mensaje “Tenes que
        ejercitar la memoria”. Los mensajes quedarán en pantalla a la espera que el usuario
        presione una tecla, luego de esto se cerrará el programa
         */
        
        Scanner sc = new Scanner(System.in);
        
        //Creamos las variables contraseña y repContraseña para guardar los datos ingresados por el usuario
        //En la variable intentos se guarda la cantidad de intentos que tiene el usuario.
        //El boolean coincide es el que verifica al final si la contraseña es valida o no
        String contraseña, repContraseña;
        int intentos = 3;
        boolean coincide = false;

        //Ingresamos la contraseña por teclado
        System.out.println("Ingrese una nueva contraseña: ");
        contraseña = sc.nextLine();
        
        //Mientras que la cantidad de intentos sea mayor a 0 se ejecuta el bucle
        while(intentos >0){
            //Mostramos la cantidad de intentos que le quedan
            //Le pedimos al usuario que ingrese nuevamente su contraseña y la guardamos.
            System.out.println("Tiene " + intentos + " intentos");
            System.out.println("Ingrese nuevamente su contraseña:");
            repContraseña = sc.nextLine();
            
            
            //Preguntamos si son iguales usando el metodo equals()
            //Si coincide mostramos el mensaje en pantalla y lavariable coincide la pasamos a true.
            //Con el break rompemos el bucle
            //Si no se cumple la condicion, mostramos contraseña incorrecta y restamos intentos.
            if(repContraseña.equals(contraseña)){
                System.out.println("Felicitaciones, recordas tu contraseña");
                coincide = true;
                break;
            }
            else{
                System.out.println("Contraseña incorrecta");
                intentos--;
            }
        }
        //Finalmente una vez fuera del bucle chequeamos nuevamente si coincide es true o false
        //De ser false mostramos un mensaje en pantalla
        if(!coincide){
            System.out.println("Tenes que ejercitar la memoria");
        }
    }
}
