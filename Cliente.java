import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<String> cedula= new ArrayList<>();
    private List<String> telefono= new ArrayList<>();
    private String direccion;
    //private List<EncabezadoFactura>;
    public Cliente(String nombre, List<String> cedula, List<String> telefono,
                   String direccion){
        if(cedula.contains(cedula)){
            throw new cedulaDuplicada("La cedula ya existe");
        }
        if(telefono.contains(telefono)){
            throw new telefonoDuplicado("El telefono ya existe");
        }
        this.nombre= nombre;
        this.cedula=cedula;
        this.telefono=telefono;
        this.direccion=direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getCedula() {
        return cedula;
    }

    public void setCedula(List<String> cedula) {
        this.cedula = cedula;
    }

    public List<String> getTelefono() {
        return telefono;
    }

    public void setTelefono(List<String> telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void modificarCliente (String pNombre, List<String> pCedula,
                                  List<String> pTelefono, String pDireccion){
        if(!cedula.equals(pCedula) && cedula.contains(pCedula)){

            throw new cedulaDuplicada("La cedula ya existe");
        }
        if(!telefono.equals(pTelefono) && telefono.contains(pTelefono)){
            throw new telefonoDuplicado("El telefono ya existe");
        }
        this.nombre=pNombre;
        this.cedula=pCedula;
        this.telefono=pTelefono;
        this.direccion= pDireccion;
    }
    public static class cedulaDuplicada extends RuntimeException{
        public cedulaDuplicada(String mensaje){
            super (mensaje);
        }
    }
    public static class telefonoDuplicado extends RuntimeException{
        public telefonoDuplicado(String mensaje){
            super (mensaje);
        }
    }

    @Override
    public String toString() {
        return "Cliente" +
                "\nnombre='" + nombre +
                "\ncedula=" + cedula +
                "\ntelefono=" + telefono +
                "\ndireccion='" + direccion;
    }
}
