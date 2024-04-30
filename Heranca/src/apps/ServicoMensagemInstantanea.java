package apps;
public abstract class ServicoMensagemInstantanea {
        public abstract void enviarMensagem();
        public abstract void receberMensagem();
        //métodos privadas, visíveis somente na classe

        //somente os filhos conhecem este método
        protected void validarConectadoInternet() {
            System.out.println("Validando se está conectado a internet");
        }
        //mais um método que todos os filhos deverão implementar
        public abstract void salvarHistoricoMensagem();
    }
