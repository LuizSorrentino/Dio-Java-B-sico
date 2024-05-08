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
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {

    }

    @Override
    public String toString() {
        return  "Bolsista " + this.getNome() + ", " + this.getSexo() + ", " + this.getIdade() + " anos" +
                "\nValor da bolsa: " + this.bolsa +
                "\nMatricula " + getMatricula() + 
                "\nCurso " + getCurso();
    }

    @Override
    public void setCurso(String curso) {
        super.setCurso(curso);
    }

    @Override
    public void setMatricula(int matricula) {
        super.setMatricula(matricula);
    }

    @Override
    public String getCurso() {
        return super.getCurso();
    }

    @Override
    public int getMatricula() {
        return super.getMatricula();
    }
    
}
