import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String telefono;
        List<Proveedores> proveedores= new ArrayList<>();
        List<Cliente> clientes= new ArrayList<>();
        List<Productos> productos= new ArrayList<>();
        Proveedores proveedores1= new Proveedores("", Collections.singletonList(""),
                Collections.singletonList(""));
        int op=0;
        do {
            System.out.println("----------Farmacia-----------");
            System.out.println("1. Ingresar Proveedor");
            System.out.println("2. Modificar Proveedor");
            System.out.println("3. Visualizar Proveedor");
            System.out.println("4. Ingresar Producto Stock");
            System.out.println("5. Modificar Producto Stock");
            System.out.println("6. Visualizar Producto Stock");
            System.out.println("7. Consultar Producto por Abastecer");
            System.out.println("8. Realizar Pedido");
            System.out.println("9. Modificar Pedido");
            System.out.println("10. Visualizar Pedido");
            System.out.println("11. Estado del Pedido");
            System.out.println("12. Consultar Pedidos por Producto");
            System.out.println("13. Consultar Pedidos por Proveedor");
            System.out.println("14. Ingresar Cliente");
            System.out.println("15. Modificar Cliente");
            System.out.println("16. Visualizar Cliente");
            System.out.println("17. Consultar facturas del Cliente");
            System.out.println("18. Generar Factura");
            System.out.println("19. Modificar Factura");
            System.out.println("20. Visualizar Ingreso");
            System.out.println("21. Visualizar Egresos");
            System.out.println("22. Visualizar Estado financiero");
            System.out.println("23. Salir\n");

            System.out.println("Ingrese una opcion: ");
            op= sc.nextInt();

            switch (op){
                case 1:{
                    ingresarProveedor((ArrayList<Proveedores>) proveedores);
                }break;
                case 2:{
                    System.out.println("Ingrese un telefono para modificar");
                    telefono= sc.next();
                    Proveedores proveedorEncontrado= buscarProveedor(proveedores, telefono);
                    if (proveedorEncontrado != null){
                        System.out.println("Ingresar nuevo nombre del proveedor");
                        String pNombreProveedor= sc.next();
                        System.out.println("Ingrese nuevo telefono del proveedor");
                        String pTelefono= sc.next();
                        System.out.println("Ingrese nuevo producto");
                        String pProducto= sc.next();
                        proveedorEncontrado.modificarProveedor(pNombreProveedor,(pTelefono),
                                Collections.singletonList(pProducto));
                    }else{
                        System.out.println("Proveedor no encontrado");
                    }
                }break;
                case 3:{
                    visualizarProveedor((ArrayList<Proveedores>) proveedores);
                }break;
                case 4:{
                    ingresarProductoStock((ArrayList<Productos>) productos);
                }break;
                case 5:{
                    System.out.println("Ingrese el codigo del producto para modificar");
                    String idProducto= sc.next();
                    Productos productoEncontrado= buscarProducto(productos, idProducto);
                    if (productoEncontrado != null){
                        System.out.println("Ingrese nuevo codigo del producto");
                        idProducto= sc.next();
                        System.out.println("Ingrese el nuevo nombre del producto: ");
                        String pNombre= sc.next();
                        System.out.println("Ingrese nueva descripcion: ");
                        String pDescripcion= sc.next();
                        System.out.println("Ingrese nueva cantidad: ");
                        int pCantidad= sc.nextInt();
                        System.out.println("Ingrese nueva cantidad minima: ");
                        int pCantidadMinima= sc.nextInt();
                        System.out.println("Ingrese nuevo precio: ");
                        double pPrecio= sc.nextDouble();
                        productoEncontrado.modificarProducto(idProducto,pNombre,pDescripcion,pCantidad,
                                pCantidadMinima,pPrecio);
                    }else{
                        System.out.println("Producto no encontrado");
                    }
                }break;
                case 6:{
                    visualizarProductos((ArrayList<Productos>) productos);
                }break;
                case 7:{

                }break;
            }
        }while(op!=23);
    }

    public static void ingresarProveedor(ArrayList<Proveedores> lista){
        String nombreProveedor;
        List<String> telefono;
        List<String> productos;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el nombre del proveedor");
        nombreProveedor= sc.next();
        System.out.println("Ingrese el telefono del proveedor");
        telefono= Collections.singletonList(sc.next());
        System.out.println("Ingrese el producto de su proveedor");
        productos= Collections.singletonList(sc.next());
        lista.add(new Proveedores(nombreProveedor,telefono,productos));
    }
    public static void ingresarProductoStock(ArrayList<Productos> lista){
        String nombreProducto, detalleProducto, idProducto;
        int cantidad, cantidadMinima;
        double precio;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el codigo del producto");
        idProducto=sc.next();
        System.out.println("Ingrese el nombre del producto");
        nombreProducto= sc.next();
        System.out.println("Ingrese el detalle del producto");
        detalleProducto= sc.next();
        System.out.println("Ingrese la cantidad del producto");
        cantidad= sc.nextInt();
        System.out.println("Ingrese la cantidad minima");
        cantidadMinima=sc.nextInt();
        System.out.println("Ingrese el precio del producto");
        precio= sc.nextDouble();
        lista.add(new Productos(idProducto,nombreProducto,detalleProducto,cantidad,cantidadMinima,precio));
    }
    public static Proveedores buscarProveedor(List<Proveedores> proveedores, String telefono){
        for(Proveedores proveedor: proveedores){
            if(proveedor.getTelefonoProveedor().contains(telefono)){
                return proveedor;
            }
        }
        return null;
    }
    public static Productos buscarProducto(List<Productos> productos, String idProducto){
        for(Productos producto: productos){
            if(producto.getIdProducto().contains(idProducto)){
                return producto;
            }
        }
        return null;
    }
    public static void visualizarProveedor(ArrayList<Proveedores> lista){
        Iterator<Proveedores> it= lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }public static void visualizarProductos(ArrayList<Productos> lista){
        Iterator<Productos> it= lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}