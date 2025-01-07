package Ejercicio75;

public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return this.titulo + ": \n" + 
                "isbn:" + isbn + "\n" +
                "titulo: " + titulo + "\n" + 
                "autor: " + autor + "\n" +
                "paginas:" + paginas + "\n";
    }
}
