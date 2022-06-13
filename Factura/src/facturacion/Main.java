package facturacion;

public class Main {
    public static void main(String[]args){
        Factura factura = new Factura();
        Empresa empresa = new Empresa("123", "SuperMercado Cesta Dorada", "1150018305001", 12);
        factura.setEmpresa(empresa);
        Cliente cliente = new Cliente("Carlos Rigoberto", "0703190025","Romero Casas" );
        Persona empleado = new Persona("Maldonado Hoyos","1150018305","Alyce Elianne");
        Producto termo = new Producto("Termo", 10f, 12);
        Producto cartulina = new Producto("Cartulina", 4.2f, 50);
        Producto esmalte = new Producto("Esmalte", 3.5f, 20);
        Producto botellaDasani= new Producto("Botella Dasani", 2.5f, 20);
        Direccion direccion = new Direccion("Av.Bejamin Carrion","Jose.J.Palacios","612-96");
        Descripcion descripcion = new Descripcion(3,factura,termo);
        factura.getDescripcionList().add(new Descripcion(3, factura, termo));
        Descripcion descripcion1 = new Descripcion(5,factura,cartulina);
        factura.getDescripcionList().add(new Descripcion(5, factura, cartulina));
        Descripcion descripcion2 = new Descripcion(3,factura,esmalte);
        factura.getDescripcionList().add(new Descripcion(3, factura, esmalte));
        Descripcion descripcion3 = new Descripcion(4,factura,botellaDasani);
        factura.getDescripcionList().add(new Descripcion(4, factura, botellaDasani));
        factura.calcularSubTotal();
        factura.calcularIVA();
        factura.calcularTotal();
        System.out.println(factura);
        System.out.println(cliente);
        System.out.println(direccion);
        System.out.println(empleado);
        System.out.println(descripcion);
        System.out.println(descripcion1);
        System.out.println(descripcion2);
        System.out.println(descripcion3);
        factura.descuento(25);
        System.out.println("\n");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Subtotal: "+factura.getSubTotal());
        System.out.println("IVA: "+ factura.getValorIva());
        System.out.println("Descuento: "+factura.getDescuento());
        System.out.println("Total: "+factura.getTotal());


    }
}
