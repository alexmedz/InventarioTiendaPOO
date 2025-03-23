package tiendainventario;

import java.util.Scanner;

public class Menu
{

    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        boolean bandera = false;
        int opc;
        Inventario inv = new Inventario();
        do
        {
            bandera = false;
            System.out.println("********* Tienda Rosy *******");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Consultar información");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("5. Modificar producto");
            System.out.println("6. Salir del programa");
            opc = leer.nextInt();
            leer.nextLine();
            switch (opc)
            {
                case 1:
                    inv.insertarProducto();
                    break;

                case 2:
                    inv.eliminarProducto();
                    break;

                case 3:
                    inv.consultarInformacion();
                    break;

                case 4:
                    inv.desplegarProductos();
                    break;

                case 5:
                    inv.modificarProducto();
                    break;
                    
                case 6:
                    System.out.println("Saliendo ...");
                    bandera = true;
                    break;

                default:
                    System.out.println("Opcion invalida");
                    bandera = true;
                    System.out.println("");
                    break;
            }
            System.out.println("");
        } while (opc != 6);
    }
}
