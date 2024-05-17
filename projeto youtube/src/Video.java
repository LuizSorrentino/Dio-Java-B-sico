public class Video implements AcoesVideo{
    private String titulo;
    private int avaliação;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    private boolean jaCurtido;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliação = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    public boolean getJaCurtido() {
        return jaCurtido;
    }
    public void setJaCurtido(boolean jaCurtido) {
        this.jaCurtido = jaCurtido;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliação() {
        return avaliação;
    }
    public void setAvaliação(int avaliação) {
        int nova;
        nova = (int) ((this.avaliação+avaliação)/this.views);
        this.avaliação = nova;
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if (!reproduzindo) {
            setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if (reproduzindo) {
            setReproduzindo(false);
        }
    }

    @Override
    public void like() {
        if (!jaCurtido) {
            setCurtidas(getCurtidas()+1);
            setJaCurtido(true);
        }
    }
    @Override
    public String toString() {
        return  "Video \n[titulo=" + titulo + 
                "\nAvaliação=" + avaliação + 
                "\nViews=" + views + ", Curtidas=" + curtidas
                + "\nReproduzindo=" + reproduzindo + "]";
    }

}
