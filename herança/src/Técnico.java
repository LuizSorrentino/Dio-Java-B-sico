public class Técnico extends Aluno{

    public Técnico(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }
    
    private String registroProfissional;

    public void praticar(){
        
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
