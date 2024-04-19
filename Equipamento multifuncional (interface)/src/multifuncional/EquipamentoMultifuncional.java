package multifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
    public void copiar(){
        System.out.println("Copiando via equipamento Multifuncional");
    }

    public void digitalizar(){
        System.out.println("Digitalizando via equipamento Multifuncional");
    }

    public void imprimir(){
        System.out.println("Imprimindo via equipamento Multifuncional");

    }
}
