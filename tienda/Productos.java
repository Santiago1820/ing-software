package tienda;

public class Productos {
    private int Id_producto;
    private String nombre;
    private String marca;
    private double precio;
    private int pza;
    private String categoria;
    public Productos(int id_producto, String nombre, String marca, double precio, int pza, String categoria) {
        Id_producto = id_producto;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.pza = pza;
        this.categoria = categoria;
    }
    public int getId_producto() {
        return Id_producto;
    }
    public void setId_producto(int id_producto) {
        Id_producto = id_producto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getPza() {
        return pza;
    }
    public void setPza(int pza) {
        this.pza = pza;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    @Override
    public String toString() {
        return "Productos [Id_producto=" + Id_producto + ", nombre=" + nombre + ", marca=" + marca + ", precio="
                + precio + ", pza=" + pza + ", categoria=" + categoria + "]";
    }
}
