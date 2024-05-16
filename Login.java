class Login{ //CREAMOS NUESTRA CLASE "LOGIN"
    //CREAMOS Y DAMOS ATRIBUTOS
    private String USUARIO, CONTRASEÑA;//CON MAYUSCULAS SABEMOS QUE ES UNA "CONSTANTE"
    private String usuario, contraseña;

    //CREAMOS UN CONSTRUCTOR
    public void inicio(){
        USUARIO = this.usuario;
        CONTRASEÑA = this.contraseña;
    }

    //CREAMOS NUESTRA FUNCION "LOGIN" PARA QUE NOS DE ACCESO
    public void login(){
        System.out.println("\n¡BIENVENIDO!");
        System.out.println("USTED A ACCEDIDO");
    }

}