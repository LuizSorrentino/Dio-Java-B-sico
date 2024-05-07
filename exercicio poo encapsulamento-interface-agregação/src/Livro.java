import Pessoas.Pessoa;

public class Livro implements Publicacao{
    private Pessoa leitor;
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private int marcadorPag;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        setAberto(false);
        setPagAtual(0);
        this.leitor = leitor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
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
 
    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    
    public boolean getAberto() {
        return aberto;
    }
    
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
 
    public int getMarcadorPag() {
        return marcadorPag;
    }

    public void setMarcadorPag(int marcadorPag) {
        this.marcadorPag = marcadorPag;
    }
   
    public void detalhar(){
        System.out.println("=================================================");
        System.out.println( "| Titulo: " + getTitulo() +
                            "\n| Autor: " + getAutor() +
                            "\n| Quantidade de Paginas: " + getTotPaginas() + 
                            "\n| Pagina Atual: " + getPagAtual() +
                            "\n| Leitor: " + getLeitor());
        System.out.println("=================================================");
                        }

    @Override
    public void abrir() {
        if (!aberto) {
            setAberto(true);
            if (aberto && getMarcadorPag()==0) {
                setMarcadorPag(0);
            }
            System.out.println("Abrindo livro");
            if (getMarcadorPag()!=0) {
                setPagAtual(getMarcadorPag());
            }
        }else{
            System.out.println("Livro já aberto");
        }

    
    }

    @Override
    public void fechar() {
        if (aberto) {
            setAberto(false);
            System.out.println("Fechando livro");
            if (this.pagAtual!=0) {
                setMarcadorPag(getPagAtual());
                System.out.println("Voce parou na pagina " + getMarcadorPag());
            }
        }else{
            System.out.println("Livro já fechado");
        }
    }

    @Override
    public void folhear(int i) {
        if (i<=this.totPaginas) {
            this.setPagAtual(i);
            System.out.println("Pag atual: " + getPagAtual());
        }else{
            System.out.println("Não é possivel folhear para mais paginas do que o livro possui.");
        }
        
    }

    @Override
    public void avancarPag() {
        if (getPagAtual()<getTotPaginas()) {
            this.setPagAtual(getPagAtual()+1);
        }else{
            System.out.println("Voce chegou a ultima pagina");
        }
    }

    @Override
    public void voltarPag() {
        if (getPagAtual()!=0) {
            this.setPagAtual(getPagAtual()-1);
        }else{
            System.out.println("Voce esta na primeira pagina");
        }
    }

}
