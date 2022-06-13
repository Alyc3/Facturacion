package facturacion;

import java.util.LinkedList;
import java.util.List;

public class Factura {

    private String fecha;
    private String numero;
    private Float subTotal;
    private Float total;
    private Float valorIva;

    private Empleado empleado;
    private Cliente cliente;
    private Empresa empresa;
    private Float descuento;

    private List<Descripcion> descripcionList;

    public Factura() {
        descripcionList = new LinkedList<>();
    }

    public void calcularIVA() {
        this.valorIva = this.subTotal * this.empresa.getPorcentajeIVA() / 100;
    }

    public void calcularSubTotal() {
        this.subTotal = 0f;
        for (Descripcion descripcion : descripcionList) {
            this.subTotal += descripcion.getValorTotal();
        }
    }
    public void calcularDescuento() {
        this.subTotal = 25f;
        for (Descripcion descripcion : descripcionList) {
            this.subTotal += descripcion.getValorTotal();
        }
    }
    public void calcularTotal() {
        this.total = this.subTotal + this.valorIva;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public Float getTotal() {
        return total;
    }

    public Float getValorIva() {
        return valorIva;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Descripcion> getDescripcionList() {
        return descripcionList;
    }

    public void setDescripcionList(List<Descripcion> descripcionList) {
        this.descripcionList = descripcionList;
    }
    public void descuento(Integer porcentaje){
        descuento = this.subTotal * porcentaje/100;
        this.subTotal = this.subTotal - descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    public Float getDescuento() {
        return descuento;
    }

    @Override
    public String toString(){
        return "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Factura \n-------------------------------------------------------------------------------------------------------------------------\n"
                +"                                                              "+this.empresa.getNombre()+"\n"+"Fecha Emision: 12/06/2022";
    }
}
