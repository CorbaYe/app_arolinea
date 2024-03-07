import java.util.LinkedList;

import javax.swing.JOptionPane;
public class app_aerolinea {
    protected static LinkedList<cls_registro_pasajeros> pasajeros = new LinkedList<>();
    protected static LinkedList<cls_compra_tiquetes> compra_tiquetes = new LinkedList<>();
    private static cls_reportes reportes = new cls_reportes();
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
        if (membresia == 1) {
            membresia = 1;
        }
        else if (membresia == 2 ) {
            membresia = 2;
        }
        else if (membresia == 3) {
            membresia = 3;
        }
        else if (membresia == 4) {
            membresia = 4;
        }else{
            JOptionPane.showMessageDialog(null, "Membresia no valida, asignando por defecto BRONCE");
            membresia = 1;
        }
        pasajeros.add(new cls_registro_pasajeros(id, nombre, contacto, correo, sexo, membresia));
        JOptionPane.showMessageDialog(null, "Cliente registrado con éxito");

    }

    private static void fnt_comprar_tiquete(){
        float descuento_membresia = 0;
        boolean sw = false;
        String id = JOptionPane.showInputDialog(null,"Ingrese el ID del cliente");
        for(int i = 0; i < pasajeros.size(); i++){
            if (pasajeros.get(i).getId().equals(id)) {
                descuento_membresia = pasajeros.get(i).getDescuento();
                sw = true;
                break;
            }
        }
        if (sw) {
            int tipo_clase = Integer.valueOf(JOptionPane.showInputDialog(null,"Selecione el tipo de clase\n\n1. Economica: $450,000\n2. Turista: $600,000 \n3. VIP $900,000 "));
            if (tipo_clase == 1) {
                tipo_clase = 1;
            }
            else if (tipo_clase == 2 ) {
                tipo_clase = 2;
            }
            else if (tipo_clase == 3) {
                tipo_clase = 3;
            }
            else{
                JOptionPane.showMessageDialog(null, "Tipo de clase no valida, asignando por defecto clase ECONOMICA");
                tipo_clase = 1;
            }
            int cantidad = Integer.valueOf(JOptionPane.showInputDialog(null,"Ingrese la cantidad de Tiketes"));
            int tipo_pago = Integer.valueOf(JOptionPane.showInputDialog(null,"Selecione el tipo de pago\n\n1. Efectivo \n2. Tarjeta de credito \n3. Tarjeta de ahorros \n4. Transferencia"));
            compra_tiquetes.add(new cls_compra_tiquetes(id, tipo_clase, cantidad, tipo_pago, descuento_membresia));
            JOptionPane.showMessageDialog(null, "Compra registrada éxitosamente");
        }else{
            JOptionPane.showMessageDialog(null, "No se encontraron registros del cliente");
        }
    }

    private static void fnt_menu(boolean menu){
        do{
            int option = Integer.valueOf(JOptionPane.showInputDialog(null,"==========MENU PRINCIPAL==========\n\n1. Registrar cliente \n2. Comprar tiquetes \n3. Reportes \n4. Salir"));
            if (option == 1) {
                fnt_registrar_cliente();
            }
            if (option == 2) {
                fnt_comprar_tiquete();
            }
            if (option == 3) {
                reportes.fnt_reporte();
            }
            if (option == 4) {
                menu = false;
            }
        }while(menu);
    }
}
