
package ejctema8;

public class EjcTema8 {

    public static void main(String[] args) {
        Persona objPersona = new Persona();
        
        objPersona.setEdad(64);
        objPersona.setNombre("Julio");
        objPersona.setTelefono("3152014570");
        
        System.out.println("La edad es: " + objPersona.getEdad());
        System.out.println("El nombre es: " + objPersona.getNombre());
        System.out.println("El telefono es: " + objPersona.getTelefono());
        
    }
    
}
