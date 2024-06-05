import java.util.Scanner; // Importamos nuestra librería "Scanner"

class Main { // Creamos nuestra clase
    // Creamos nuestro método principal
    public static void main(String[] args) {
        Lista lista = new Lista(); // Creamos una instancia de Lista para manejar productos

        try (Scanner scan = new Scanner(System.in)) { // Creamos nuestro objeto "scan" para utilizar la librería "Scanner"
            // Creamos nuestras variables para guardar los datos ingresados por el usuario
            String usuario, contraseña;
            int b;
            boolean a, x = false;

            // Creamos el ciclo "do while" por si el usuario o contraseña son incorrectos, los vuelva a pedir
            do {
                // Pedimos y guardamos los datos ingresados por el usuario
                System.out.print("\nUSUARIO: ");
                usuario = scan.nextLine();
                System.out.print("\nCONTRASEÑA: ");
                contraseña = scan.nextLine();

                // Creamos nuestro objeto Login
                Login log = new Login("OSCAR", "holaquehace"); // Login con datos de ejemplo

                // Comparamos los datos ingresados por el usuario con los guardados en el objeto Login
                if (usuario.equals(log.getUsuario()) && contraseña.equals(log.getContraseña())) {
                    System.out.println("¡Acceso concedido!"); // Mensaje de éxito
                } else { // Notificamos que el usuario o contraseña son incorrectos
                    System.out.println("\n¡USUARIO O CONTRASEÑA INCORRECTOS!");
                }

                // Validamos los datos ingresados y si son incorrectos los volvemos a pedir, y si son correctos damos acceso
                a = (usuario.equals(log.getUsuario()) && contraseña.equals(log.getContraseña()));
            } while (!a);

            // Creamos un menú para dar múltiples opciones en nuestro proyecto
            System.out.println("\n-------------MENÚ-------------");
            do {
                try {
                    // Lo hacemos con otro "do while" para que sea repetitivo
                    do {
                        System.out.println("\nINGRESE LO QUE DESEE HACER\n ");
                        System.out.println("1.- CREAR");
                        System.out.println("2.- CONSULTAR");
                        System.out.println("3.- ACTUALIZAR");
                        System.out.println("4.- ELIMINAR");
                        System.out.println("5.- SALIR");
                        b = scan.nextInt();
                        scan.nextLine(); // Limpiar el buffer

                        // Utilizamos el método "switch" para poder hacer según sea el caso
                        switch (b) {
                            case 1:
                                System.out.println("-------------CREANDO PRODUCTOS-------------");
                                MainProductos crear = new MainProductos();
                                crear.Crear(lista); // Llamamos al método Crear de MainProductos y le pasamos la lista
                                break;
                            case 2:
                                System.out.println("-----------CONSULTANDO PRODUCTO------------");
                                Consultar consultar = new Consultar();
                                consultar.mostrarProductos(lista); // Llamamos al método mostrarProductos de Consultar y le pasamos la lista
                                break;
                            case 3:
                                System.out.println("-----------ACTUALIZANDO PRODUCTO-----------");
                                Actualizar.actualizarProducto(lista); // Llamamos al método actualizarProducto de Actualizar y le pasamos la lista
                                break;
                            case 4:
                                System.out.println("-----------ELIMINANDO PRODUCTO------------");
                                Eliminar.eliminarProducto(lista); // Llamamos al método eliminarProducto de Eliminar y le pasamos la lista
                                break;
                            case 5:
                                System.out.println("Saliendo del sistema...");
                                break;
                            default:
                                System.out.println("Opción no válida, intente de nuevo.");
                                break;
                        }
                    } while (b != 5); // Salimos del menú cuando la opción sea 5 (SALIR)
                    x = true;
                } catch (Exception e) {
                    System.out.println("\nERROR");
                    System.out.println("INGRESE EL NUMERO QUE DESEE HACER: ");
                    scan.next();
                }
            } while (!x); // Salimos del programa cuando x sea true
        }
    }
}
