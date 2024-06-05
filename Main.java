import java.util.Scanner; //IMPORTAMOS NUESTRA LIBRERIA "SCANNER"

class Main { //CREAMOS NUESTRA CLASE
    //CREAMOS NUESTRO METODO PRINCIPAL
    public static void main(String[] args) {
        Lista lista = new Lista();

        try (Scanner scan = new Scanner(System.in)) { //CREAMOS NUESTRO OBJETO "SCAN" PARA UTILIZAR LA LIBRERIA "SCANNER"
            //CREAMOS NUESTRAS VARIABLES PARA GUARDAR LOS DATOS INGRESADOS POR EL USUARIO
            String usuario, contraseña;
            int b;
            boolean a, x = false;

            //CREAMOS EL CICLO "DO WHILE" POR SI EL USUARIO O CONTRASEÑA SON INCORRECTOS LOS VUELVA A PEDIR
            do {
                //PEDIMOS Y GUARDAMOS LOS DATOS INGRESADOS POR EL USUARIO
                System.out.print("\nUSUARIO: ");
                usuario = scan.nextLine();
                System.out.print("\nCONTRASEÑA: ");
                contraseña = scan.nextLine();

                //HACEMOS NUESTRO METODO CONTRUCTOR "LOGIN"
                Login log = new Login("OSCAR", "holaquehace"); // Login con datos de ejemplo

                //COMPARAMOS LOS DATOS INGRESADOS POR EL USUARIO CON LOS GUARDADOS EN EL METODO CONTRUCTOR "LOGIN"
                if (usuario.equals(log.getUsuario()) && contraseña.equals(log.getContraseña())) {
                    System.out.println("¡Acceso concedido!"); // Mensaje de éxito
                } else { //NOTIFICAMOS QUE EL "USUARIO" O "CONTRSEÑA" SON INCORRETOS
                    System.out.println("\n¡USUARIO O CONTRASEÑA INCORRECTOS!");
                }
                /*VALIDAMOS LOS DATOS INGRESADOS Y SI SON INCORRECTOS LOS VOLVEMOS A PEDIR
                Y SÍ SI SON CORRECTOS DAMOS ACCESO */
                a = (usuario.equals(log.getUsuario()) && contraseña.equals(log.getContraseña()));
            } while (a != true);

            //CREAMOS UN MENÚ PARA DAR MULTIPLES OPCIONES EN NUESTRO PROYECTO
            System.out.println("\n-------------MENÚ-------------");
            do {
                try {
                    //LO HACEMOS CON OTRO "DO WHILE" PARA QUE SEA REPETITIVO
                    do {
                        System.out.println("\nINGRESE LO QUE DESEE HACER\n ");
                        System.out.println("1.- CREAR");
                        System.out.println("2.- CONSULTAR");
                        System.out.println("3.- ACTUALIZAR");
                        System.out.println("4.- ELIMINAR");
                        System.out.println("5.- SALIR");
                        b = scan.nextInt();
                        scan.nextLine(); // Limpiar el buffer
                        //UTILIZAMOS EL METODO "SWITCH" PARA PODER HACER SEGÚN SEA EL CASO
                        switch (b) {
                            case 1:
                                System.out.println("-------------CREANDO PRODUCTOS-------------");
                                MainProductos crear = new MainProductos();
                                crear.Crear(lista);
                                break;
                            case 2:
                                System.out.println("-----------CONSULTANDO PRODUCTO------------");
                                Consultar consultar = new Consultar();
                                consultar.mostrarProductos(lista);
                                break;
                            case 3:
                                System.out.println("-----------ACTUALIZANDO PRODUCTO-----------");
                                Actualizar.actualizarProducto(lista);
                                break;
                            case 4:
                                System.out.println("-----------ELIMINANDO PRODUCTO------------");
                                Eliminar.eliminarProducto(lista);
                                break;
                            case 5:
                                System.out.println("Saliendo del sistema...");
                                break;
                            default:
                                System.out.println("Opción no válida, intente de nuevo.");
                                break;
                        }
                    } while (b != 5);
                    x = true;
                } catch (Exception e) {
                    System.out.println("\nERROR");
                    System.out.println("INGRESE EL NUMERO QUE DESEE HACER: ");
                    scan.next();
                }
            } while (!x);
        }
    }
}
