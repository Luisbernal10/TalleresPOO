public class Libro {
    String titulo;
    String autor;
    int numPaginas;

    public Libro() {
        titulo = "Cien años de soledad";
        autor = "Gabriel garcia Marquez";
        numPaginas = 600;
    }

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void mostrarDetalles() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numPaginas);
    }

    public String toString() {
        return "Libro { Titulo: " + titulo + ", Autor: " + autor + ", Numero de paginas: " +
                numPaginas + "}";
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();
    }
}