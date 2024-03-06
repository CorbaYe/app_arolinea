public class cls_tipo_clase {
    final private float ECONOMIA_VALOR = 450000F;
    final private float TURISTA_VALOR = 600000F;
    final private float VIP_VALOR = 900000F;

    final private float EFECTIVO_DESCUENTO = 0.05F;
    final private float TARJETA_CREDITO__DESCUENTO = 0.07F;
    final private float TARJETA_AHORRO_DESCUENTO = 0.02F;
    final private float TRANSFERENCIA_DESCUENTO = 0.1F;

    public float fnt_valor_tipo_clase(int tipo_clase){
        if (tipo_clase == 1){
            return ECONOMIA_VALOR;
        }else if (tipo_clase == 2) {
            return TURISTA_VALOR;
        }else if (tipo_clase == 3) {
            return VIP_VALOR;
        }
        return 0;
    }

    public float fnt_descuento_pago(int tipo_pago){
        if (tipo_pago == 1){
            return EFECTIVO_DESCUENTO;
        }else if (tipo_pago == 2) {
            return TARJETA_CREDITO__DESCUENTO;
        }else if (tipo_pago == 3) {
            return TARJETA_AHORRO_DESCUENTO;
        }else if (tipo_pago == 3) {
            return TRANSFERENCIA_DESCUENTO;
        }
        return 0;
    }
    
}
