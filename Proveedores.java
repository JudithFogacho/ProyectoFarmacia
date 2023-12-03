import java.util.ArrayList;
import java.util.List;

public class Proveedores {
    private String nombreProveedor;
    private List<String> telefonoProveedor= new ArrayList<>();
    private List<String> producto;
    private List<EncabezadoPedido> encabezadoP;
    public Proveedores(String nombreProveedor, List<String> telefonoProveedor,
                       List<String> producto){
        if(telefonoProveedor.contains(telefonoProveedor)){
            throw new Cliente.telefonoDuplicado("El telefono ya existe");
        }
        this.nombreProveedor= nombreProveedor;
        this.telefonoProveedor=telefonoProveedor;
        this.producto=producto;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public List<String> getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(List<String> telefonoP) {
        this.telefonoProveedor = telefonoP;
    }

    public List<String> getProducto() {
        return producto;
    }

    public void setProducto(List<String> producto) {
        this.producto = producto;
    }
    public void modificarProveedor(String pNombreProveedor, List<String> pTelefono,
                                   List<String> producto){
        if(telefonoProveedor.contains(pTelefono)){
            throw new Productos.idDuplicado("El telefono ya existe");
        }
        this.nombreProveedor= pNombreProveedor;
        this.telefonoProveedor=pTelefono;
        this.producto=producto;
    }

    @Override
    public String toString() {
        return "Proveedores" +
                "\nNombreProveedor:" + nombreProveedor +
                "\nTelefono Proveedor:"+ telefonoProveedor +
                "\nProducto:" + producto;
    }
}
