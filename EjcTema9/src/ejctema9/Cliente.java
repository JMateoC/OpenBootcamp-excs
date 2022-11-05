
package ejctema9;

public class Cliente extends Persona {
    private int credito;
    
    public Cliente(){
        
    }

    public Cliente(int credito, int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

}
