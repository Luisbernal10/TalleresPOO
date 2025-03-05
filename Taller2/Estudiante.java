public class Estudiante {
    String nombre;
    int edad;

    public Estudiante() {
        this("Luis", 6);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Estudiante: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    public static void main(String[] args) {
        Estudiante estu = new Estudiante();
        Estudiante.mostrarDatos();
    }
    }