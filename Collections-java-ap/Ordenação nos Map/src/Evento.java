
public class Evento {
    //Atributos
    private String nome;
    private String atracao;
    //Construtor
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }
    //Getters n Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAtracao() {
        return atracao;
    }
    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }

    @Override
    public String toString() {
        return "Evento " + nome + ", atracao=" + atracao;
    }
}
