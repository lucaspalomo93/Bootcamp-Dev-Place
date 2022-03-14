package EjerciciosPOO;



public class PasswordTest {
    public static void main(String[] args) {
        
        //Creamos la isntancia de la clase Password, podemos pasarle otro valor en longitud con un maximo de 8.
        Password pw1 = new Password(8);
        
        //Mostramos los valores.
        System.out.println("Longitud: ");
        System.out.println(pw1.getLongitud());
        System.out.println("Contraseña: ");
        pw1.generarPassowrd();
        System.out.println(pw1.getContraseña());
        System.out.println("Es fuerte: ");
        System.out.println(pw1.esFuerte());
        
    }
    
}
