package facturacion;

public class Persona {
    private String apellidos;
    private String identificacion;
    private String nombre;

    public Persona(){

    }

    public Persona(String apellidos, String identificacion, String nombre) {
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Empleado: " + this.nombre +" " + this.apellidos+ "\n\n"+
                "Cantidad                Producto                      Precio                                    Stock                     Precio Total";
    }
}
