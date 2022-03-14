package EjercicioBaseDeDatos;

public class Empleados {
    
    //Atributos de clase
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private int antiguedad;
    private double salario;
    private String nombrePuesto;
    private String municipalidad;
    
    private static int contadorEmpleados;

    //Constructor vacio
    public Empleados() {

    }
  
    
    //Constructor con argumentos
    public Empleados(String nombre, String apellido, String telefono, 
            String email, int antiguedad, double salario, String nombrePuesto, 
            String municipalidad){
        
        //Para cada objeto de tipo empleado se crea un ID unico 
        //Incrementamos la variable estatica asociada a la clase contadorEmpleados
        //Su valor se lo asignamos a la variable idEmpleado
        this.idEmpleado = ++Empleados.contadorEmpleados;

        
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.antiguedad = antiguedad;
        this.salario = salario;
        this.nombrePuesto = nombrePuesto;
        this.municipalidad = municipalidad;
    }
    
    //Metodos getter y setter
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getMunicipalidad() {
        return municipalidad;
    }

    public void setMunicipalidad(String municipalidad) {
        this.municipalidad = municipalidad;
    }

    
    //Metodo toString para poder imprimir el objeto
    @Override
    public String toString() {
        return "Empleados{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email + ", antiguedad=" + antiguedad + ", salario=" + salario + ", nombrePuesto=" + nombrePuesto + ", municipalidad=" + municipalidad + '}';
    }
    
    
}
