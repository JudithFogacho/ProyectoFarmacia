import java.util.ArrayList;
import java.util.List;

public class Proveedores {
    private String nombreProveedor;
    private List<String> telefonoProveedor = new ArrayList<>();
    private List<String> producto;
    private List<EncabezadoPedido> encabezadoP;

    public Proveedores(String nombreProveedor, List<String> telefonoProveedor, List<String> producto) {
        this.nombreProveedor = nombreProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.producto = producto;
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

    public void modificarProveedor(String pNombreProveedor, String pNuevoTelefono, List<String> pProducto) {
        this.nombreProveedor = pNombreProveedor;
        this.telefonoProveedor = List.of(pNuevoTelefono); // Solo se permite cambiar el número de teléfono
        this.producto = pProducto;
    }

    @Override
    public String toString() {
        return "Proveedores" +
                "\nNombreProveedor:" + nombreProveedor +
                "\nTelefono Proveedor:" + telefonoProveedor +
                "\nProducto:" + producto;
    }

    // Excepción para manejar teléfonos duplicados
    public static class TelefonoDuplicado extends RuntimeException {
        public TelefonoDuplicado(String message) {
            super(message);
        }
    }
}
