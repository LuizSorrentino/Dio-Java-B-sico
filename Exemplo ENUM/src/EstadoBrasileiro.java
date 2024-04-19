public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piauí"),
	MARANHAO ("MA","Maranhão") ;

    private String nome;
    private String sigla;
    private int ibge;

    EstadoBrasileiro(String sigla, String nome) {
        //TODO Auto-generated constructor stub
        this.sigla = sigla;
        this.nome = nome;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNome(){
        return nome;
    }

    public String getNomeMaisuculo(){
        return nome.toUpperCase();
    }
}
