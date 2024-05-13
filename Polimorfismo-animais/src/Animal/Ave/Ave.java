package Animal.Ave;
import Animal.Animal;

public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    public void fazerNinho(){
        System.out.println("Construindo ninho");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo fruta");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    } 
}
