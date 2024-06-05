public class Consultar {
    // Método para mostrar los productos en la lista
    public void mostrarProductos(Lista lista) {
        // Recorre la lista de productos
        for (Productos producto : lista.getListaProductos()) {
            // Imprime la información detallada de cada producto
            System.out.println("ID DEL PRODUCTO: " + producto.getId() + ", NOMBRE DEL PRODUCTO: " + producto.getNombre() + ", MARCA: " + producto.getMarca() + ", PRECIO: $" + producto.getPrecio());
        }
    }
}
