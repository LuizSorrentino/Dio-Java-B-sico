public class Caneta {
    private String modelo;
    private float tipoPonta;
    private String cor;
    private int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Qual o modelo da caneta: " + this.modelo);
        System.out.println("Qual o tipo de ponta da caneta: " + this.tipoPonta);
        System.out.println("Qual a cor da caneta: " + this.cor);
        System.out.println("Qual a carga da caneta: " + this.carga);
        System.out.println("A caneta está tampada: " + this.tampada);

    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getTipoPonta() {
        return tipoPonta;
    }

    public void setTipoPonta(int tipoPonta) {
        this.tipoPonta = tipoPonta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void Rabiscar(){
        if (tampada==true) {
            Destampar();            
        }
        else if(carga==0){
            System.out.println("Recarregar tinta");
        }
        else{
        System.out.println("Rasbicando");
        }    
    }

    public void Pintar(){
        if (tampada==true) {
            Destampar();
        }
        else if(carga==0){
            System.out.println("Recarregar tinta");
        }
        else{
        System.out.println("Pintando");
        }   
    }

    public void Escrever(){
        if (tampada==true) {
            Destampar();
        }
        else if(carga==0){
            System.out.println("Recarregar tinta");
        }
        else{
        System.out.println("Escrevendo");
        }
    }

    public void Tampar() {
        tampada = true;
        System.out.println("Caneta tampada");
    }

    public void Destampar() {
        tampada = false;
        System.out.println("Caneta destampada");
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

}

