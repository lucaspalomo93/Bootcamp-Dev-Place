package EjerciciosPOO;

import java.util.Random;


/*

    Haz una clase llamada Password que siga las siguientes condiciones:
    ● Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de
    8 caracteres.
    ● Los constructores serán los siguiente:
    ■ Un constructor por defecto.
    ■ Un constructor con la longitud que nosotros le pasemos (Generará una
    contraseña aleatoria con esa longitud).
    ● Los métodos que implementa serán:
    ○ esFuerte(): devuelve un booleano si es fuerte o no, para que sea
    fuerte debe tener más de 2 mayúsculas, más de 1 minúscula y más de
    3 números.
    ○ generarPassword(): genera la contraseña del objeto con la longitud
    que tenga.
    ○ Métodos get para los atributos contraseña y longitud.
    ○ Método set para stributo longitud

*/


public class Password {
    
    //Atributos de la clase
    private int longitud = 8;
    private char[] contraseña = new char[longitud];

    
    //Constructores
    public Password() {
    }

    public Password(int longitud) {
        this.longitud = longitud;
    }

    
    
    //Metodos getter y setter.
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public char[] getContraseña() {
        return contraseña;
    }

    
    //Metodo generador de contraseñas
    public void generarPassowrd() {
        
        //Creamos las variables con todos los posibles caracteres que puedan ir en la contraseña
        //Concatenamos todos los caracteres en una sola variable
        String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnñopqrstuvwxyz";
        String numeros = "0123456789";
        String todosValores = mayusculas + minusculas + numeros;
        
        //Creamos la instancia de la clase Random
        //Creamos una contraseña nueva que va a tener tantos caracteres como longitud tenga
        Random random = new Random();
        char[] contraseñaGenerada = new char[this.longitud];

        //Recorremos la contraseña con un bucle for
        //Por cada indice, le vamos a asignar un nuevo caracter, pasandole un numero random
        //Este numero random equivale a un caracter en nuestra cadena con todos los caracteres posibles
        for(int i = 0; i< contraseñaGenerada.length; i++){
            this.contraseña[i] = todosValores.charAt(random.nextInt(todosValores.length()));
        }
    }
    
    
    //Metodo para definir si una variable es fuerte o no
    public boolean esFuerte(){
        
        //Declaramos las variables
        int contadorMayusculas = 0, contadorMinusculas = 0, contadorNumeros = 0;
        
        //Con un bucle for recorremos la contraseña
        //Con los metodos isUpperCase, isLowerCase y isDigit verificamos si esos valores son mayuscula, minuscula o numericos
        //Contamos cuantos de cada uno hay en la contraseña
        for(int i = 0; i< this.contraseña.length; i++){
            if(Character.isUpperCase(this.contraseña[i])){
                contadorMayusculas++;
            }
            else if(Character.isLowerCase(this.contraseña[i])){
                contadorMinusculas++;
            }
            else if(Character.isDigit(this.contraseña[i])){
                contadorNumeros++;
            }
        }
        
        //Si los contadores son mayores a los numeros pedidos entonces retorna verdadero
        return contadorMayusculas >= 2 && contadorMinusculas >= 1 && contadorNumeros >= 3;
    }

   
    
}
