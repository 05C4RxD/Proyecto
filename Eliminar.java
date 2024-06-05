import java.util.Scanner;

public class Eliminar {
    public static void eliminarProducto(Lista lista) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        boolean x = false;

        do {
            try {
                System.out.print("Ingrese el ID del producto a eliminar: ");
                int id = scanner.nextInt();

                lista.eliminarProducto(id);

                System.out.println("Producto eliminado exitosamente.");
                x = true;
            } catch (Exception e) {
                System.out.println("Error");
                System.out.println("DATOS INVALIDOS, VUELVA A INTENTARLO");
                scanner.next();
            }
        } while (!x);
    }
    
}
