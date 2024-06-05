import java.util.ArrayList; // Importa la clase ArrayList para manejar listas dinámicas

public class Lista {
    // Declaración de una lista para almacenar los productos
    private ArrayList<Productos> listaProductos;

    // Constructor de la clase Lista
    public Lista() {
        this.listaProductos = new ArrayList<>(); // Inicializa la lista vacía
    }

    // Método para agregar un producto a la lista
    public void agregarProducto(Productos producto) {
        listaProductos.add(producto); // Añade el producto a la lista listaProductos
    }

    // Método para obtener la lista de productos
    public ArrayList<Productos> getListaProductos() {
        return listaProductos; // Devuelve la lista de productos
    }

    // Método para eliminar un producto de la lista por su ID
    public void eliminarProducto(int id) {
        // Elimina el producto cuyo ID coincida con el ID dado
        listaProductos.removeIf(producto -> producto.getId() == id);
    }

    // Método para actualizar un producto en la lista
    public void actualizarProducto(Productos productoActualizado) {
        // Recorre la lista de productos
        for (Productos producto : listaProductos) {
            // Si el ID del producto coincide con el ID del producto actualizado
            if (producto.getId() == productoActualizado.getId()) {
                // Actualiza el nombre, marca y precio del producto
                producto.setNombre(productoActualizado.getNombre());
                producto.setMarca(productoActualizado.getMarca());
                producto.setPrecio(productoActualizado.getPrecio());
                break; // Termina el bucle después de actualizar el producto
            }
        }
    }
}
