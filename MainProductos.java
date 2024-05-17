import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class MainProductos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String marca;
        int id, precio, a;
        List<Productos> lista = new ArrayList<Productos>();
        System.out.println("\nSI EN ALGÚN MOMENTO DESEAS CANCELAR, DIGITE 0\n"); 
        
            do{
                lista.add(new Productos(id, marca, precio));

                System.out.print("INGRESE el ID PRODUCTO: ");
                id = sc.nextInt();
                System.out.print("INGRESE LA MARCA: ");
                marca = sc.next();
                System.out.print("INGRESE UN PRECIO: $");
                precio = sc.nextInt();
            }while(id == 0);

        for(Productos pro : lista){
            System.out.println("ID DEL PRODUCTO: " + pro.getId() + ", MARCA: " + pro.getMarca() + ", PRECIO: $" + pro.getPrecio());
        }
    }
}