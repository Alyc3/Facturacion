package facturacion;
import java.util.List;
public class Direccion {
    private String callePrincipal;
    private String calleSecundaria;
    private String numeroCasa;
    private String referencia;
    private String telefonoFijo;
    private String telefonoMovil;

    private List<Empresa>empresaList;
    private List<Cliente>clienteList;

    public Direccion(String callePrincipal, String calleSecundaria){
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
    }
    public Direccion(String callePrincipal,String calleSecundaria, String numeroCasa){
        this(callePrincipal,calleSecundaria);
        this.numeroCasa = numeroCasa;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public List<Empresa> getEmpresaList() {
        return empresaList;
    }

    public void setEmpresaList(List<Empresa> empresaList) {
        this.empresaList = empresaList;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    @Override
    public String toString(){
        return "Direccion: "+ this.callePrincipal+" entre "+this.calleSecundaria+".   Num de Casa:  "+this.numeroCasa;
    }
}
