package Base;
import empleados.Empleados;
import javax.swing.JOptionPane;
public class BaseDatos {
    
    public static void main(String[] args) {
        String opcion="ala";
        Empleados empleado1 = new Empleados();
        Empleados empleado2 = new Empleados();
        Empleados empleado3 = new Empleados();
        Empleados empleado4 = new Empleados();
        Empleados empleado5 = new Empleados();
        
        
        
        do {    
            opcion = JOptionPane.showInputDialog("¿Qué desea hacer?\n"
                    + "ingresar = ingresar dator\n"
                    + "mostrar = mostrar datos\n"
                    + "salir = finalizar datos");
            switch (opcion) {
            case "ingresar":
                //empleado1
                empleado1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado 1"));
                empleado1.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección del empleado 1"));
                empleado1.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono del empleado 1"));
                empleado1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado 1")));              
                //empleado2
                empleado2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado 2"));
                empleado2.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección del empleado 2"));
                empleado2.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono del empleado 2"));
                empleado2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado 2")));
                //empleado3
                empleado3.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado 3"));
                empleado3.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección del empleado 3"));
                empleado3.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono del empleado 3"));
                empleado3.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado 3")));
                //empleado4
                empleado4.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado 4"));
                empleado4.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección del empleado 4"));
                empleado4.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono del empleado 4"));
                empleado4.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado 4")));
                //empleado5
                empleado5.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado 5"));
                empleado5.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección del empleado 5"));
                empleado5.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono del empleado 5"));
                empleado5.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado 5")));
                break;
            case "mostrar":
                //empleado1
                JOptionPane.showMessageDialog(null,"El nombre del empleado 1 es "+empleado1.getNombre()+ "\n"+
                        "su edad es " + empleado1.getEdad()+" años\n"
                        +"su dirección es "+ empleado1.getDireccion()+"\n"+
                        "su telefono es "+ empleado1.getTelefono()
                );
                //empleado2
                JOptionPane.showMessageDialog(null,"El nombre del empleado 2 es "+empleado2.getNombre()+ "\n"+
                        "su edad es " + empleado2.getEdad()+" años\n"
                        +"su dirección es "+ empleado2.getDireccion()+"\n"+
                        "su telefono es "+ empleado2.getTelefono()
                );
                //empleado3
                JOptionPane.showMessageDialog(null,"El nombre del empleado 3 es "+empleado3.getNombre()+ "\n"+
                        "su edad es " + empleado3.getEdad()+" años\n"
                        +"su dirección es "+ empleado3.getDireccion()+"\n"+
                        "su telefono es "+ empleado3.getTelefono()
                );
                //empleado4
                JOptionPane.showMessageDialog(null,"El nombre del empleado 4 es "+empleado4.getNombre()+ "\n"+
                        "su edad es " + empleado4.getEdad()+" años\n"
                        +"su dirección es "+ empleado4.getDireccion()+"\n"+
                        "su telefono es "+ empleado4.getTelefono()
                );
                //empleado5
                JOptionPane.showMessageDialog(null,"El nombre del empleado 5 es "+empleado5.getNombre()+ "\n"+
                        "su edad es " + empleado5.getEdad()+" años\n"
                        +"su dirección es "+ empleado5.getDireccion()+"\n"+
                        "su telefono es "+ empleado5.getTelefono()
                );
                break;
               
            default:
                if ("salir".equals(opcion)) {
                    JOptionPane.showMessageDialog(null, "Hasta pronto.");
                }else{
                    JOptionPane.showMessageDialog(null, "Opción invalida");
                }
        }//case
        } while (!"salir".equalsIgnoreCase(opcion) );
        
    }//main
    
}//BaseDatos
