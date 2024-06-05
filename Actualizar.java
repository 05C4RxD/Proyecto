import java.util.Scanner; // Importa la clase Scanner para la entrada de datos desde el teclado

public class Actualizar {
    // Método estático para actualizar un producto en la lista
    public static void actualizarProducto(Lista lista) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        boolean x = false; // Variable booleana para controlar el bucle do-while

        do {
            try {
                System.out.print("Ingrese el ID del producto a actualizar: ");
                int id = scanner.nextInt(); // Lee el ID del producto que se va a actualizar
                scanner.nextLine(); // Limpia el buffer del scanner para evitar problemas con nextLine()

                System.out.print("Ingrese el nuevo nombre del producto: ");
                String nombre = scanner.nextLine(); // Lee el nuevo nombre del producto

                System.out.print("Ingrese la nueva marca del producto: ");
                String marca = scanner.nextLine(); // Lee la nueva marca del producto

                System.out.print("Ingrese el nuevo precio del producto: ");
                double precio = scanner.nextDouble(); // Lee el nuevo precio del producto

                // Crea un nuevo objeto Productos con los datos actualizados
                Productos productoActualizado = new Productos(id, nombre, marca, precio);
                // Llama al método actualizarProducto de la lista para actualizar el producto
                lista.actualizarProducto(productoActualizado);

                System.out.println("Producto actualizado exitosamente."); // Mensaje de éxito
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
