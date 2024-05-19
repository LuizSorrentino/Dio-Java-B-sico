public class Livro {
    
    private int ano;
    private String titulo;
    private String autor;
    
    public Livro(String titulo, String autor, int ano) {
        this.ano = ano;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo +", ano=" + ano + ", autor=" + autor + "]\n";
    }
}

