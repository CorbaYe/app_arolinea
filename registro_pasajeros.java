public class registro_pasajeros {
    private String id;
    private String nombre;
    private String contacto;
    private String correo;
    private String sexo;
    private int membresia; 
    private float descuento;
    private Membresia obj_membresia = new Membresia();

    public registro_pasajeros(String id, String nombre, String contacto, String correo, String sexo, int membresia) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.correo = correo;
        this.sexo = sexo;
        this.membresia = membresia;
        this.descuento = obj_membresia.fnt_descuento(membresia);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public String getSexo() {
        return sexo;
    }

    public int getMembresia() {
        return membresia;
    }

    public float getDescuento() {
        return descuento;
    }

    public Membresia getObj_membresia() {
        return obj_membresia;
    }
    
}