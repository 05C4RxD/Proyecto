import java.util.Scanner;

public class MainProductos {
    private String a;
    private int id, precio;

    // Método para crear productos y agregarlos a la lista
    public void Crear(Lista lista){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        boolean x = false;
        
        // Ciclo do-while para manejar la entrada de datos
        do {
            try {
                // Ciclo do-while para crear múltiples productos
                do {
                    // Ingreso del ID del producto
                    System.out.print("\nINGRESE EL ID PRODUCTO: ");
                    id = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea

                    // Ingreso del nombre del producto
                    System.out.print("INGRESE EL NOMBRE DEL PRODUCTO: ");
                    String nombre = sc.nextLine();

                    // Ingreso de la marca del producto
                    System.out.print("INGRESE LA MARCA: ");
                    String marca = sc.nextLine();

                    // Ingreso del precio del producto
                    System.out.print("INGRESE UN PRECIO: $");
                    precio = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea

                    // Creación del objeto Producto
                    Productos producto = new Productos(id, nombre, marca, precio);

                    // Agregar el producto a la lista
                    lista.agregarProducto(producto);

                    // Pregunta para agregar otro producto
                    System.out.println("\n¿DESEAS AGREGAR OTRO PRODUCTO? (si/no)\n");
                    a = sc.next();
                    while (!(a.equals("si") || a.equals("no"))) {
                        System.out.println("\n¿DESEAS AGREGAR OTRO PRODUCTO? (si/no)\n");
                        a = sc.next();
                    }
                } while (a.equals("si"));

                // Mostrar todos los productos ingresados
                System.out.println("\nLISTA DE PRODUCTOS INGRESADOS:");
                for (Productos pro : lista.getListaProductos()) {
                    System.out.println("ID DEL PRODUCTO: " + pro.getId() + ", NOMBRE DEL PRODUCTO: " + pro.getNombre() + ", MARCA: " + pro.getMarca() + ", PRECIO: $" + pro.getPrecio());
                }
                x = true; // Terminar el ciclo do-while principal
            } catch (Exception e) {
                System.out.println("\nERROR, DATOS INVALIDOS");
                System.out.println("VUELVA A INTENTARLO: ");
                sc.nextLine(); // Consumir la línea incorrecta
            }
        } while (!x); // Repetir hasta que se ingresen datos válidos y se termine la entrada
    }
}
