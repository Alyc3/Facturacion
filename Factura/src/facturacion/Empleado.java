package facturacion;
import java.util.List;

public class Empleado extends Persona{
    private List<Factura>facturaList;

    public List<Factura> getFacturaList(){
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

}
