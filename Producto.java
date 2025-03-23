package tiendainventario;

public class Producto
{
    private String nombre;
    private int cp;
    private byte cantidad;
    private double precio;

    public Producto()
    {

    }

    public Producto(String nombre, int cp, byte cantidad, double precio)
    {
        this.nombre = nombre;
        this.cp = cp;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the cp
     */
    public int getCp()
    {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(int cp)
    {
        this.cp = cp;
    }

    /**
     * @return the cantidad
     */
    public byte getCantidad()
    {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(byte cantidad)
    {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public String desplegarInf()
    {
        return "*****************************" +"\n"
                + "Producto: " + getNombre() + "\n"
                + "Codigo: " + getCp() + "\n"
                + "Cantidad: " + getCantidad() + "\n"
                + "Preco: $" + getPrecio() + "\n"
                + "*****************************";
    }

}
