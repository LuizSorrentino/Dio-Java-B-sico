public class PlanoOperadora {
    public static void main(String[] args) {
		String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}

		}
        for (int carneirinhos = 1 ; carneirinhos <= 20 ; carneirinhos ++){
        System.out.println(carneirinhos + " carneirinho(s)");
        }
        System.out.println(("João dormiu"));
	}
}   
        

    
