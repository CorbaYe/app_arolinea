import java.util.LinkedList;

import javax.swing.JOptionPane;
public class app_aerolinea {
    private static LinkedList<registro_pasajeros> pasajeros = new LinkedList<>();
    public static void main(String[] args) {
        fnt_menu(true);
    }

    private static void fnt_registrar_cliente(){
        String sexo = "";
        String id = JOptionPane.showInputDialog(null,"Ingrese el ID del cliente");
        String nombre = JOptionPane.showInputDialog(null,"Ingrese el Nombre del cliente");
        String contacto = JOptionPane.showInputDialog(null,"Ingrese el Contacto del cliente");
        String correo = JOptionPane.showInputDialog(null,"Ingrese el Correo del cliente");
        int option_sexo = Integer.valueOf(JOptionPane.showInputDialog(null,"Selecione el sexo\n\n1. Masculino\n2. Femenino \n3.  Otro "));
        if (option_sexo == 1) {
            sexo = "Masculino";
        }else if (option_sexo == 2) {
            sexo = "Femenino";
        }else {
            sexo = "Otro";
        }
        int membresia = Integer.valueOf(JOptionPane.showInputDialog(null,"Selecione el tipo de membresia\n\n 1. BRONCE\n2. PLATA \n3.  ORO \n4. PLATINO"));
        if (membresia != 1 || membresia != 2 || membresia != 3 || membresia != 4) {
            JOptionPane.showMessageDialog(null, "Membresia no valida, asignando por defecto BRONCE");
            membresia = 1;
        }
        pasajeros.add(new registro_pasajeros(id, nombre, contacto, correo, sexo, membresia));
    }

    private static void fnt_menu(boolean menu){
        do{
            int option = Integer.valueOf(JOptionPane.showInputDialog(null,"==========MENU PRINCIPAL==========\n\n1. Registrar cliente \n2. Salir"));
            if (option == 1) {
                fnt_registrar_cliente();
            }
        }while(menu);
    }
}