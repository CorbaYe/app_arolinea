import java.util.Date;;

public class cls_compra_tiquetes {
    private Date fecha;
    private String id_cliente;
    private int tipo_clase;
    private int cantidad;
    private float subtotal;
    private float iva; //19%
    private float descunto_pago;
    private int tipo_pago;
    private float descuento_membresia;
    private float total;
    private cls_tipo_clase obj_tipo_clase = new cls_tipo_clase();

    public cls_compra_tiquetes(String id_cliente, int tipo_clase, int cantidad, int tipo_pago, float descuento_membresia) {
        this.fecha = new Date();
        this.id_cliente = id_cliente;
        this.tipo_clase = tipo_clase;
        this.cantidad = cantidad;
        this.subtotal = cantidad * obj_tipo_clase.fnt_valor_tipo_clase(tipo_clase);
        this.tipo_pago = tipo_pago;
        this.iva=0.19f*this.subtotal;
        this.descunto_pago = obj_tipo_clase.fnt_descuento_pago(tipo_pago) * subtotal;
        this.descuento_membresia = descuento_membresia * this.subtotal;
        this.total = subtotal - (iva + descuento_membresia + descunto_pago);
    }

    

}
