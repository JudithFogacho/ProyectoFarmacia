import java.util.List;

public class EncabezadoPedido {
    private Proveedores proveedores;
    private Fecha fecha;
    private boolean estadoPedido;
    private int contadorPedido;

    private List<DetallePedidos> detalleP;
    public EncabezadoPedido(Proveedores proveedores, Fecha fecha, boolean
                            estadoPedido){
        this.proveedores= proveedores;
        this.estadoPedido= false;
        this.fecha= fecha;
    }
    public Proveedores getProveedores() {
        return proveedores;
    }
    private int crearIdPedido(){
        return contadorPedido++;
    }
    public int getCodigoPedido(){
        return contadorPedido;
    }
    public boolean estadoPedido(){
        return estadoPedido;
    }
    public void actualizarEstadoEnviado(boolean estadoPedido){
        this.estadoPedido=estadoPedido;
    }
    public Fecha fecha(){
        return fecha;
    }
    public void modificarEncabezado(Proveedores pProveedor, Fecha pFecha){
        this.proveedores= pProveedor;
        this.fecha=pFecha;
    }
}
