import java.util.List;

public class EncabezadoFactura {
    private Cliente cliente;
    private Fecha fecha;
    private int numFactura;

    private List<DetalleFactura> detalleF;
    public EncabezadoFactura(Cliente cliente, Fecha fecha,
                             List<DetalleFactura> detalleF){
        this.cliente=cliente;
        this.fecha=fecha;
        this.detalleF=detalleF;
        this.numFactura=getNumFactura();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public int getNumFactura() {
        return numFactura++;
    }
    public void modificarFactura(Cliente pCliente, Fecha pFecha,
                                 List<DetalleFactura> pDetalleF){
        this.cliente=pCliente;
        this.fecha=pFecha;
        this.detalleF= pDetalleF;
    }
}
