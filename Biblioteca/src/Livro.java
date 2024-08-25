public class Livro {
    private String autor;
    private String isbn;

    public Livro(String autor, String isbn) {
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String validacao() {
        return super.validacao() && !autor.isEmpty() && (isbn.length()==10 || isbn.length()==13);
    }
}
