import java.util.ArrayList;
import java.util.List;

public class DetalleFactura {
    private EncabezadoFactura encabezadoFactura;
    private List<Productos> productos;
    private double total;
    private double descuentos;
    private double subtotal;
    public DetalleFactura(List<Productos> productos, EncabezadoFactura encabezadoFactura){
        this.productos= new ArrayList<>();
        this.encabezadoFactura=encabezadoFactura;
    }
    public List<Productos> darProducto(){
        return productos;
    }
    public double calcularSubTotal(){
        subtotal=0.0;
        for(Productos p: productos){
            subtotal+=p.getPrecio();
        }
        return subtotal;
    }
    public double calcularDescuento(){
        if (productos.size()>=15){
            descuentos=subtotal*0.25;
        }
        return descuentos;
    }
    public double calcularTotal(){
        total=subtotal-descuentos;
        return total;
    }
}
