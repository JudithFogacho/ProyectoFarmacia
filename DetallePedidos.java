import java.util.ArrayList;
import java.util.List;

public class DetallePedidos {
    private List<Productos> productos;
    private EncabezadoPedido encabezadoPedido;
    private double total;
    public DetallePedidos(List<Productos> productos, EncabezadoPedido encabezadoPedido){
        this.productos= new ArrayList<>();
        this.encabezadoPedido=encabezadoPedido;
    }
    public List<Productos> darProducto(){
        return productos;
    }
    public double calcularTotal(){
        total=0.0;
        for(Productos p: productos){
            total+=p.getPrecio();
        }
        return total;
    }
}
