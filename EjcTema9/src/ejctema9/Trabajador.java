
package ejctema9;

public class Trabajador extends Persona{
    private int salario;

    public Trabajador() {
    }

    public Trabajador(int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
