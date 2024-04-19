package apps;
public class FacebookMessenger extends ServicoMensagemInstantanea{

    @Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}

    @Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
    @Override
    public void salvarHistoricoMensagem() {
        
        System.out.println("Salvando o Historico a mensagem");}
}
