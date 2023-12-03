import java.util.List;

public class Contabilidad {
    private List<DetalleFactura> detalleFacturas;
    private List<DetallePedidos> detallePedidos;
    private double patrimonio;
    public Contabilidad(List<DetalleFactura> detalleFacturas,
                        List<DetallePedidos> detallePedidos){
        this.detalleFacturas= detalleFacturas;
        this.detallePedidos= detallePedidos;
    }

    public List<DetalleFactura> getDetalleFacturas() {
        return detalleFacturas;
    }

    public List<DetallePedidos> getDetallePedidos() {
        return detallePedidos;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public double calcularIngresosTotales(){
        double ingresosTotales=0.0;
        for(DetalleFactura dF: detalleFacturas){
            ingresosTotales= dF.calcularTotal();
        }
        return ingresosTotales;
    }
    public double calcularEgresosTotales(){
        double egresosTotales=0.0;
        for (DetallePedidos dP: detallePedidos){
            egresosTotales= dP.calcularTotal();
        }
        return egresosTotales;
    }
    public double calcularPatrimonio (){
        patrimonio= calcularIngresosTotales()-calcularEgresosTotales();
        return patrimonio;
    }
    public void estadoFinanciero(){
        if (patrimonio>0){
            System.out.println("El estado financiero de la farmacia es Superávit");
        } else if (patrimonio<0) {
            System.out.println("El estado financiero de la farmacia es Déficit");
        }else{
            System.out.println("El estado financiero de la farmacia es Punto de Equilibrio");
        }
    }
}
