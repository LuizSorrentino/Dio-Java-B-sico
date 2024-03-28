public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligar ();
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Tv ligada: " + smartTv.ligada);
        
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Novo status Canal atual: " + smartTv.canal);

        smartTv.canalAbaixo();
        System.out.println("Ultimo status Canal atual: " + smartTv.canal);

}
}