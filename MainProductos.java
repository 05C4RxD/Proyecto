import java.util.Scanner;

public class MainProductos {
    private String a;
    private int id, precio;

    public void Crear(Lista lista){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        boolean x = false;
        
        do {
            try {
                do {
                    System.out.print("\nINGRESE EL ID PRODUCTO: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("INGRESE EL NOMBRE DEL PRODUCTO: ");
                    String nombre = sc.nextLine();
                    System.out.print("INGRESE LA MARCA: ");
                    String marca = sc.nextLine();
                    System.out.print("INGRESE UN PRECIO: $");
                    precio = sc.nextInt();

                    Productos producto = new Productos(id, nombre, marca, precio);
                    lista.agregarProducto(producto);

                    System.out.println("\n¿DESEAS GREGAR OTRO PRODUCTO? (si/no)\n");
                    a = sc.next();
                    while (!(a.equals("si") || a.equals("no"))) {
                        System.out.println("\n¿DESEAS GREGAR OTRO PRODUCTO? (si/no)\n");
                        a = sc.next();
                    }
                } while (a.equals("si"));

                for (Productos pro : lista.getListaProductos()) {
                    System.out.println("ID DEL PRODUCTO: " + pro.getId() + ", NOMBRE DEL PRODUCTO: " + pro.getNombre() + ", MARCA: " + pro.getMarca() + ", PRECIO: $" + pro.getPrecio());
                }
                x = true;
            } catch (Exception e) {
                System.out.println("\nERROR, DATOS INVALIDOS");
                System.out.println("VUELVA A INTENTARLO: ");
                sc.nextLine(); // Consumir la línea incorrecta
            }
        } while (!x);
    }
}
