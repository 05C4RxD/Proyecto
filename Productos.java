class Productos{
    String marca;
    int id, precio;

    public Productos(int id, String marca, int precio){
        this.marca = marca;
        this.id = id;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos [marca=" + marca + ", id=" + id + ", precio=" + precio + "]";
    }
}