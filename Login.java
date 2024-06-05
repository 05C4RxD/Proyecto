public class Login {
    private String usuario; // Atributo para almacenar el usuario
    private String contraseña; // Atributo para almacenar la contraseña

    // Constructor de la clase Login
    public Login(String usuario, String contraseña) {
        this.usuario = usuario; // Asigna el usuario proporcionado al atributo usuario
        this.contraseña = contraseña; // Asigna la contraseña proporcionada al atributo contraseña
    }

    // Método getter para obtener el usuario
    public String getUsuario() {
        return usuario; // Devuelve el valor del atributo usuario
    }

    // Método setter para establecer el usuario
    public void setUsuario(String usuario) {
        this.usuario = usuario; // Asigna el nuevo valor de usuario al atributo usuario
    }

    // Método getter para obtener la contraseña
    public String getContraseña() {
        return contraseña; // Devuelve el valor del atributo contraseña
    }

    // Método setter para establecer la contraseña
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña; // Asigna el nuevo valor de contraseña al atributo contraseña
    }
}
