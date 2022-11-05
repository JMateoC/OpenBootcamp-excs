
package ejctema9;

public class EjcTema9 {

 
    public static void main(String[] args) {
        System.out.println("---------------- Cliente ----------------");
        Cliente objCliente = new Cliente();
        
        objCliente.setCredito(15);
        objCliente.setEdad(25);
        objCliente.setNombre("Adrian");
        objCliente.setTelefono("311202145");
        
        System.out.println(objCliente.getCredito());
        System.out.println(objCliente.getEdad());
        System.out.println(objCliente.getNombre());
        System.out.println(objCliente.getTelefono());
        
        System.out.println("---------------- Trabajador ----------------");
        Trabajador objTrabajador = new Trabajador();
        
        objTrabajador.setSalario(900000);
        objTrabajador.setEdad(36);
        objTrabajador.setNombre("Lucio");
        objTrabajador.setTelefono("320528781");
        
        System.out.println(objTrabajador.getSalario());
        System.out.println(objTrabajador.getEdad());
        System.out.println(objTrabajador.getNombre());
        System.out.println(objTrabajador.getTelefono());
        
       
    }
    
}
