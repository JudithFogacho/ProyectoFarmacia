import java.util.ArrayList;
import java.util.List;

public class DetallePedidos {
    private Productos productos;
    private EncabezadoPedido encabezadoPedido;
    private double total;
    public DetallePedidos(Productos productos, EncabezadoPedido encabezadoPedido){
        this.productos= productos;
        this.encabezadoPedido=encabezadoPedido;
    }
    public Productos darProducto(){
        return productos;
    }
    public double calcularTotal(){
        total=0.0;
        total= darProducto().getPrecio()* darProducto().getStock();
        return total;
    }
}
