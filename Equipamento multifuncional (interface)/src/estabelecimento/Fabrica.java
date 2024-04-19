package estabelecimento;

import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
       Impressora impressora = new EquipamentoMultifuncional();

       impressora.imprimir();
    }
}
