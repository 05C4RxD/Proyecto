import java.util.ArrayList;

public class Lista {
    private ArrayList<Productos> listaProductos;

    public Lista() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Productos producto) {
        listaProductos.add(producto);
    }

    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public void eliminarProducto(int id) {
        listaProductos.removeIf(producto -> producto.getId() == id);
    }

    public void actualizarProducto(Productos productoActualizado) {
        for (Productos producto : listaProductos) {
            if (producto.getId() == productoActualizado.getId()) {
                producto.setNombre(productoActualizado.getNombre());
                producto.setMarca(productoActualizado.getMarca());
                producto.setPrecio(productoActualizado.getPrecio());
                break;
            }
        }
    }
}
