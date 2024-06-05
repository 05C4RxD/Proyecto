import java.util.Scanner; // Importa la clase Scanner para la entrada de datos desde el teclado

public class Eliminar {
    // Método estático para eliminar un producto de la lista
    public static void eliminarProducto(Lista lista) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        boolean x = false; // Variable booleana para controlar el bucle do-while

        do {
            try {
                // Solicita el ID del producto a eliminar
                System.out.print("Ingrese el ID del producto a eliminar: ");
                int id = scanner.nextInt(); // Lee el ID del producto a eliminar

                // Llama al método eliminarProducto de la lista para eliminar el producto
                lista.eliminarProducto(id);

                // Mensaje de éxito
                System.out.println("Producto eliminado exitosamente.");
                x = true; // Cambia la variable x a true para salir del bucle
            } catch (Exception e) {
                // Manejo de excepciones
                System.out.println("Error");
                System.out.println("DATOS INVALIDOS, VUELVA A INTENTARLO"); // Mensaje de error
                scanner.next(); // Limpia el scanner para la próxima entrada
            }
        } while (!x); // El bucle se repite hasta que x sea true
    }
}
