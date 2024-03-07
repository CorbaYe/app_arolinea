import java.util.LinkedList;

import javax.swing.JOptionPane;

public class cls_reportes {
    private LinkedList<cls_registro_pasajeros> pasajeros = new LinkedList<>();
    private LinkedList<cls_compra_tiquetes> compra_tiquetes = new LinkedList<>();

    public void fnt_reporte(String id_cliente){
        String reporte_cliente = "";
        String reporte_tikets = "";
        int posicion_cliente = 0;
        int posicion_tikets = 0;
        boolean sw_cliente = false;
        boolean sw_tikets = false;
        for(int i = 0; i < pasajeros.size(); i++){
            if (pasajeros.get(i).getId().equals(id_cliente)) {
                posicion_cliente = i;
                sw_cliente = true;
                break;
            }
        }
        for(int i = 0; i < compra_tiquetes.size(); i++){
            if (compra_tiquetes.get(i).getId_cliente().equals(id_cliente)) {
                posicion_tikets = i;
                sw_tikets = true;
                break;
            }
        }
        if (sw_cliente) {
            String menbresia = "";
            if (pasajeros.get(posicion_cliente).getMembresia() == 1) {
                menbresia = "BRONCE";
            }
            else if (pasajeros.get(posicion_cliente).getMembresia() == 2) {
                menbresia = "PLATA";
            }
            else if (pasajeros.get(posicion_cliente).getMembresia() == 3) {
                menbresia = "ORO";
            }
            else if (pasajeros.get(posicion_cliente).getMembresia() == 4) {
                menbresia = "PLATINO";
            }
            reporte_cliente = "ID: " + pasajeros.get(posicion_cliente).getId()  + "\n" +
                            "Nombre: "  + pasajeros.get(posicion_cliente).getNombre()  + "\n" +
                            "Contacto: "  + pasajeros.get(posicion_cliente).getContacto()  + "\n" +
                            "Correo: "  + pasajeros.get(posicion_cliente).getCorreo()  + "\n" +
                            "Sexo: "  + pasajeros.get(posicion_cliente).getSexo()  + "\n" +
                            "Membresia: "  + menbresia  + "\n";

        }
        if (sw_tikets) {
            //Tipo de clase
            String tipo_clase = "";
            if (compra_tiquetes.get(posicion_tikets).getTipo_clase() == 1) {
                tipo_clase = "ECONOMICA";
            }
            else if (compra_tiquetes.get(posicion_tikets).getTipo_clase() == 2) {
                tipo_clase = "TURISTA";
            }
            else if (compra_tiquetes.get(posicion_tikets).getTipo_clase() == 3) {
                tipo_clase = "VIP";
            }
            //Tpo de pago
            String tipo_pago = "";
            if (compra_tiquetes.get(posicion_tikets).getTipo_pago() == 1) {
                tipo_pago = "EFECTIVO";
            }
            else if (compra_tiquetes.get(posicion_tikets).getTipo_pago() == 2) {
                tipo_pago = "TARJETA DE CREDITO";
            }
            else if (compra_tiquetes.get(posicion_tikets).getTipo_pago() == 3) {
                tipo_pago = "TARJETA DE AHORROS";
            }
            else if (compra_tiquetes.get(posicion_tikets).getTipo_pago() == 3) {
                tipo_pago = "TRANSFERENCIA";
            }
            //Reporte
            reporte_tikets = "Fecha: " + compra_tiquetes.get(posicion_tikets).getFecha()  + "\n" +
                            "Tipo de clase: "  + tipo_clase + "\n" +
                            "Cantidad: "  + compra_tiquetes.get(posicion_tikets).getCantidad()  + "\n" +
                            "Subtotal: "  + compra_tiquetes.get(posicion_tikets).getSubtotal()  + "\n" +
                            "IVA: "  + compra_tiquetes.get(posicion_tikets).getIva()  + "\n" +
                            "Tipo de pago: "  + tipo_pago  + "\n" +
                            "Descuento_membresia: "  + compra_tiquetes.get(posicion_tikets).getDescuento_membresia()  + "\n" +
                            "Total: "  + compra_tiquetes.get(posicion_tikets).getTotal()  + "\n";

        }
        JOptionPane.showMessageDialog(null, "===============REPORTE===============\n"+ reporte_cliente + reporte_tikets + "===============FIN===============");
    }
}
