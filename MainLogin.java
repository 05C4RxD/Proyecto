import java.util.Scanner;//IMPORTAMOS NUESTRA LIBRERIA "SCANNER"
class MainLogin{//CREAMOS NUESTRA CLASE

    //CREAMOS NUESTRO METODO PRINCIPAL
    public static void main(String[] args){
        //CREAMOS NUESTRO OBJETO "SCAN" PARA UTILIZAR LA LIBRERIA "SCANNER"
        Scanner scan = new Scanner(System.in);
        //CREAMOS NUESTRAS VARIABLES PARA GUARDAR LOS DATOS INGRESADOS POR EL USUARIO
        String usuario, contraseña;

        //PEDIMOS Y GUARDAMOS LOS DATOS INGRESADOS POR EL USUARIO
        do{
            System.out.print("\nUSUARIO: ");
            usuario = scan.nextLine();
            System.out.print("\nCONTRASEÑA:");
            contraseña = scan.nextLine();

            //HACEMOS NUESTRO METODO CONTRUCTOR "LOGIN"
            Login log = new Login();

            //COMPARAMOS LOS DATOS INGRESADOS POR EL USUARIO CON LOS GUARDADOS EN EL METODO CONTRUCTOR "LOGIN"
            if (usuario.equals("OSCAR") && contraseña.equals("elbicho07SIUUU")){
                log.login();
            }else{
                System.out.println("\n¡USUARIO O CONTRASEÑA INCORRECTOS!");
            }
        }while(!(usuario.equals("OSCAR") && contraseña.equals("elbicho07SIUUU")));
    }
}