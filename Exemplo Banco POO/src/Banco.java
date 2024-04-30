//import java.util.Random;

public class Banco {
    public static void main(String[] args) {
        Banco conta1 = new Banco();
        conta1.abrirConta("CP", "Adalberto");
        System.out.println(conta1.getNumConta());
        conta1.depositarDinheiro(1000);
        conta1.sacarDinheiro(200);
        conta1.pagarMensalidade();
        conta1.fecharConta();
        conta1.sacarDinheiro(930.00);
        conta1.fecharConta();

    }

    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

        public Banco() {
        this.saldo = 0;
        this.status = false;
    }
        public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo, String dono){
        this.setTipo(tipo);
        if (tipo=="CC") {
            this.setSaldo(getSaldo()+50);
            this.setStatus(true);
            this.setNumConta(47000);
            System.out.println("Você abriu uma conta corrente!");
        }
        else if(tipo=="CP"){
            this.setSaldo(getSaldo()+150);
            this.setStatus(true);
            this.setNumConta(46000);
            System.out.println("Você abriu uma conta poupança!");
        } else {
            System.out.println("O tipo de conta deverá ser CC(Conta Corrente) ou CP (Conta Poupança)");
        }
        
        //Random rand = new Random();
        //setNumConta(rand.nextInt(89999)+10000);
        
    }
    public void fecharConta(){
        if(saldo < 0){
            System.out.println("Gentileza regularizar sua situação de débito com o banco!");
        }else if(saldo > 0){
            System.out.println("Gentileza realizar o saque do valor que reside na conta antes de fecha-la!");
        }else{
            this.setStatus(false);
            System.out.println("Você fechou a conta com sucesso!");
        }
            
    }
    public void depositarDinheiro(double valor){
        if (status=true) {
            setSaldo(getSaldo()+valor);
            System.out.println("Seu saldo agora é R$" + saldo);
        }
        else{
            System.out.println("Será necessário realizar a abertura da conta para finalizar esta operação.");
        }
    }
    public void sacarDinheiro(double valor){
        if (status==false) {
            System.out.println("Será necessário realizar a abertura da conta para finalizar esta operação.");
        }
        else if (valor <= saldo){
            setSaldo(getSaldo() - valor);
            System.out.println("Seu saldo agora é R$" + saldo);
        }
        else{
            System.out.println("Seu saldo é insuficiente para completar esta operação.");
        }
    }
    public void pagarMensalidade(){
        if (status==true && tipo=="CC") {
            setSaldo(getSaldo()-12);
            System.out.println("Seu saldo agora é R$" + saldo);
        }else if (status==true && tipo=="CP"){
            setSaldo(getSaldo()-20);
            System.out.println("Seu saldo agora é R$" + saldo);
        }
    }
}

