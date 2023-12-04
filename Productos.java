import java.util.List;

public class Productos {
    private String idProducto;
    private String nombreProducto;
    private int stock;
    private int cantidadMinima;
    private String descripcion;
    private double precio;
    private List<DetallePedidos> detalleP;
    //private List<DetalleFactura> detalleF;
    public Productos(String idProducto,String nombreProducto, String descripcion,
                     int stock, int cantidadMinima, double precio){
        this.idProducto= idProducto;
        this.nombreProducto= nombreProducto;
        this.descripcion= descripcion;
        this.stock= stock;
        this.cantidadMinima= cantidadMinima;
        this.precio=precio;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void modificarProducto(String pIdProducto,String pNombreProducto, String pDescripcion,
                                  int pStock, int pCantidadMinima, double pPrecio){
        this.idProducto= pIdProducto;
        this.nombreProducto= pNombreProducto;
        this.descripcion= pDescripcion;
        this.stock= pStock;
        this.cantidadMinima= pCantidadMinima;
        this.precio=pPrecio;
    }
    //consultas productos: se ha abastecido el ultimo mes (rango de fecha), detalles,
}
