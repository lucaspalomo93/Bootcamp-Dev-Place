package EjercicioBaseDeDatos;

import java.util.*;

public class PruebaEmpleados {
    public static void main(String[] args) {
        
        //Creamos una lista de empleados
        List<Empleados> listaEmpleados = new ArrayList();
        
        //Creamos objetos de tipo Empleados
        Empleados empleado1 = new Empleados("Lucas", "Palomo", "123456", "lucas@mail.com", 5, 80000, "Funcionario", "Mar del Plata");
        Empleados empleado2 = new Empleados("Fernando", "Gomez", "333111444", "fer@mail.com", 11, 120000, "Administrativo", "Miramar");
        Empleados empleado3 = new Empleados("Maria", "Sol", "55577778", "maria@mail.com", 8, 100000, "Infraestructura", "Mar Chiquita");
        Empleados empleado4 = new Empleados("Juana", "Lopez", "112223334", "juana@mail.com", 13, 140000, "Asesora", "Tandil");
        
        //Agregamos los objetos a la lista
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4);
        
       //Llamamos a la funcion que muestra la informacion de los empleados que cumplen los requisitos
        empleadosRequisitos(listaEmpleados);
    }
    
    
    //Funcion para ver si cumplen los requisitos
    public static void empleadosRequisitos(List<Empleados> empleados){
        //Recorremos la lista
        for(Empleados empleado : empleados){
            //Nos traemos los parametros guardandolos en una variable usando los metodos getter
            double salario = empleado.getSalario();
            int antiguedad = empleado.getAntiguedad();
            
            //Chequeamos si el salario y la antiguedad corresponden
            
            if(salario > 7000 && antiguedad > 10 && antiguedad < 15){
                //Mostramos los empleados que cumplen los requisitos.
                System.out.println("El empleado cumple con los requisitos: " );
                System.out.println(empleado);
            }
        }
    }


}
