package tiendainventario;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Inventario
{

    private Scanner leer = new Scanner(System.in);
    ArrayList<Producto> pc = new ArrayList<>();

    public Producto agregarProducto()
    {
        String nombre;
        int cp;
        byte cantidad;
        double precio;
        boolean bandera = false;
        System.out.println("Nombre del producto:");
        nombre = leer.nextLine();
        System.out.println("Cantidad del producto:");
        cantidad = leer.nextByte();
        cp=this.generarCp();
        System.out.println("Precio:");
        precio = leer.nextDouble();
        System.out.println("Cp: "+cp);
        leer.nextLine();
        return new Producto(nombre, cp, cantidad, precio);
    }

    public void insertarProducto()
    {
        pc.add(this.agregarProducto());
    }
    
    public int generarCp()
    {
        int cp;
        boolean bandera= false;
        Random random= new Random();
        do
        {
            cp= 100+ random.nextInt(300);
            for (int i = 0; i < pc.size(); i++)
            {
                if (pc.get(i).getCp()== cp)
                {
                    bandera= true;
                    break;
                }
            }
        } while (bandera);
        return cp;
    }

    public void desplegarProductos()
    {
        if (pc.isEmpty())
        {
            System.out.println("No hay datos registrados");
        } else
        {
            for (int i = 0; i < pc.size(); i++)
            {
                System.out.print(i + 1);
                System.out.println(pc.get(i).desplegarInf());
            }
        }
    }

    public void eliminarProducto()
    {
        int cp;
        boolean bandera = false;
        System.out.println("Codigo del producto:");
        cp = leer.nextInt();

        for (int i = 0; i < pc.size(); i++)
        {
            if (pc.get(i).getCp() == cp)
            {
                System.out.println("Producto eliminado " + pc.get(i).getNombre());
                pc.remove(i);
                bandera = true;
                break;
            }
        }
        if (!bandera)
        {
            System.out.println("Producto no encontrado");
            leer.nextLine();
        }
    }

    public void consultarInformacion()
    {
        int opc;
        int cp;
        boolean bandera = false;
        String nombre;
        System.out.println("");
        System.out.println("1. Consultar por nombre");
        System.out.println("2. Consultar por codigo");
        opc = leer.nextInt();
        leer.nextLine();
        switch (opc)
        {
            case 1:
                System.out.println("Ingresa el nombre");
                nombre = leer.nextLine();
                for (int i = 0; i < pc.size(); i++)
                {
                    if (pc.get(i).getNombre().equalsIgnoreCase(nombre))
                    {
                        System.out.println(pc.get(i).desplegarInf());
                        bandera = true;
                        break;
                    }
                }
                if (!bandera)
                {
                    System.out.println("Producto no encontrado");
                    bandera = true;
                }
                break;

            case 2:
                System.out.println("Ingres el codigo del producto");
                cp = leer.nextInt();
                for (int i = 0; i < pc.size(); i++)
                {
                    if (pc.get(i).getCp() == cp)
                    {
                        System.out.println(pc.get(i).desplegarInf());
                        bandera = true;
                        break;
                    }
                }
                if (!bandera)
                {
                    System.out.println("Producto no encontrado");
                    bandera = true;
                }
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    public void modificarProducto()
    {
        int cp;
        byte cantidad;
        double precio;
        System.out.println("Ingre el código del producto: ");
        cp = leer.nextInt();
        leer.nextLine();
        boolean bandera = false;
        for (int i = 0; i < pc.size(); i++)
        {
            if (pc.get(i).getCp() == cp)
            {
                System.out.println(pc.get(i).desplegarInf());
                System.out.println("Igresa el nuevo precio: ");
                precio = leer.nextDouble();
                pc.get(i).setPrecio(precio);
                System.out.println("Ingresa la nueva cantidad: ");
                cantidad = leer.nextByte();
                pc.get(i).setCantidad(cantidad);
                System.out.println(pc.get(i).desplegarInf());
                bandera = true;
                break;
            }
        }
        if (!bandera || pc.isEmpty())
        {
            System.out.println("Producto no encontrado");
        }
    }
}
