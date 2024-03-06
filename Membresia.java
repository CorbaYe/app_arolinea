public class Membresia {
    final private float BRONCE_DESCUENTO = 0.10F;
    final private float PLATA_DESCUENTO = 0.15F;
    final private float ORO_DESCUENTO = 0.25F;
    final private float PLATINO_DESCUENTO = 0.35F;

    public float fnt_descuento(int membresia){
        if (membresia == 1){
            return BRONCE_DESCUENTO;
        }else if (membresia == 2) {
            return PLATA_DESCUENTO;
        }else if (membresia == 3) {
            return ORO_DESCUENTO;
        }else if (membresia == 4) {
            return PLATINO_DESCUENTO;
        }
        return 0;
    }
}
