public class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante() {
        nombre = "Felipe Bernal";
        edad = 10;
        curso = "Primaria";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;

    }

    public String toString() {
        return "Estudiante { Nombre del estudiante: " + nombre +
                ", Edad del estudiante: " + edad +
                ", Curso del estudiante: " + curso + "}";
    }

}