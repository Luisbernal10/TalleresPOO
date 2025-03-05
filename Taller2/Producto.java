public class Producto {
    String nombre;
    int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Producto: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }

    public static void main(String[] args) {
        Producto p = new Producto("Bolsa de arroz", 2500);
        p.mostrarProducto();
    }
}