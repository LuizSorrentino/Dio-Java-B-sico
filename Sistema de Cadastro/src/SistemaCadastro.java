public class SistemaCadastro  {
    public static void main(String[] args) throws Exception {
        //criamos uma pessoa no sistema
		Pessoa luiz = new Pessoa("11222795663","Luizin");
		
		//definimos o endereço de marcos
		luiz.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(luiz.getNome() + "-" + luiz.getCpf());
	}
}
    

