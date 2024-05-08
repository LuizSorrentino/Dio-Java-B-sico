public class Bolsista extends Aluno{

    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public Bolsista(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade() {

    }
    
}
