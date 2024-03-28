public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar (){
        ligada = false;    
    }

    public void canalAcima(){
        canal++;
    }
    
    public void canalAbaixo(){
        canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;   
    }

}