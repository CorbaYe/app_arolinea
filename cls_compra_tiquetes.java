import java.util.Date;;

public class cls_compra_tiquetes {
    private Date fecha;
    private String id_cliente;
    private int tipo_clase;
    private int cantidad;
    private float subtotal;
    private float iva; //19%
    private float descuento_pago;
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
        this.iva = 0.19f * this.subtotal;
        this.descuento_pago = obj_tipo_clase.fnt_descuento_pago(tipo_pago) * subtotal;
        this.descuento_membresia = descuento_membresia * this.subtotal;
        this.total = (subtotal + iva) - (descuento_membresia + descuento_pago);
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getTipo_clase() {
        return tipo_clase;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public float getIva() {
        return iva;
    }

    public float getDescuento_pago() {
        return descuento_pago;
    }

    public int getTipo_pago() {
        return tipo_pago;
    }

    public float getDescuento_membresia() {
        return descuento_membresia;
    }

    public float getTotal() {
        return total;
    }

    public cls_tipo_clase getObj_tipo_clase() {
        return obj_tipo_clase;
    }
    
}
