import java.util.ArrayList; // Importa la clase ArrayList para manejar listas dinámicas

public class Carrito {
    // Declaración de una lista para almacenar los productos en el carrito
    private ArrayList<Productos> carrito;

    // Constructor de la clase Carrito
    public Carrito() {
        this.carrito = new ArrayList<>(); // Inicializa la lista vacía
    }

    // Método para agregar un producto al carrito
    public void agregarProductoAlCarrito(Productos producto) {
        carrito.add(producto); // Añade el producto a la lista carrito
    }

    // Método para mostrar todos los productos en el carrito
    public void mostrarCarrito() {
        for (Productos producto : carrito) { // Itera sobre cada producto en el carrito
            System.out.println(producto); // Imprime la información del producto
        }
    }

    // Método para obtener la lista de productos en el carrito
    public ArrayList<Productos> getCarrito() {
        return carrito; // Devuelve la lista carrito
    }
}
