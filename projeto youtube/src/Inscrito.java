public class Inscrito extends Pessoa{

    private String login;
    private int totAssistido;

    public Inscrito(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm(){
        setTotAssistido(getTotAssistido()+1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    protected void ganharExp() {
        super.ganharExp();
    }

    @Override
    public String toString() {
        return "Inscrito [login=" + login + ", totAssistido=" + totAssistido + "]" + super.toString();
    }
}
