public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private int memoriaVolume;

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("O volume está em " + this.getVolume());
        for (int i=0 ; i<=this.getVolume() ; i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()==true) {
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()==true) {
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado()==true && this.getVolume()>0) {
            setMemoriaVolume(getVolume());
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado()==true && this.getVolume()==0) {
            setVolume(getMemoriaVolume());
        }
    }

    @Override
    public void play() {
        if (this.getLigado()==true && !getTocando()) {
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado()==true && getTocando()) {
            setTocando(false);
        }
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private int getMemoriaVolume() {
        return memoriaVolume;
    }

    private void setMemoriaVolume(int memoriaVolume) {
        this.memoriaVolume = memoriaVolume;
    }
    
}
