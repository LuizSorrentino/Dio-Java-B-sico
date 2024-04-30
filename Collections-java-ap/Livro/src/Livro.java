public class Livro {
    
    private String ano;
    private String titulo;
    private String autor;
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }
}

