public class Productos {
    // Atributos de la clase Productos
    private int id;         // ID del producto
    private String nombre;  // Nombre del producto
    private String marca;   // Marca del producto
    private double precio;  // Precio del producto

    // Constructor de la clase Productos
    public Productos(int id, String nombre, String marca, double precio) {
        this.id = id;           // Inicializa el ID del producto con el valor recibido
        this.nombre = nombre;   // Inicializa el nombre del producto con el valor recibido
        this.marca = marca;     // Inicializa la marca del producto con el valor recibido
        this.precio = precio;   // Inicializa el precio del producto con el valor recibido
    }

    // Métodos getter y setter para acceder y modificar los atributos privados de la clase Productos

    public int getId() {
        return id;   // Devuelve el ID del producto
    }

    public void setId(int id) {
        this.id = id;   // Establece el ID del producto
    }

    public String getNombre() {
        return nombre;   // Devuelve el nombre del producto
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;   // Establece el nombre del producto
    }

    public String getMarca() {
        return marca;   // Devuelve la marca del producto
    }

    public void setMarca(String marca) {
        this.marca = marca;   // Establece la marca del producto
    }

    public double getPrecio() {
        return precio;   // Devuelve el precio del producto
    }

    public void setPrecio(double precio) {
        this.precio = precio;   // Establece el precio del producto
    }

    // Método toString() para representar los datos del producto como una cadena de texto

    @Override
    public String toString() {
        return "Producto [ID=" + id + ", Nombre=" + nombre + ", Marca=" + marca + ", Precio=" + precio + "]";
    }
}
