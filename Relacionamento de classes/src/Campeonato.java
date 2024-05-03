import java.util.ArrayList;

public class Campeonato {
    public static void main(String[] args) {
                ArrayList<Lutador> lutadores= new ArrayList<Lutador>();
        Lutador l1 = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 10, 3, 1);
        Lutador l2 = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 12, 2, 3);
        Lutador l3 = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 9, 4, 1);
        Lutador l4 = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 11, 5, 2);
        Lutador l5 = new Lutador("Jorge", "Portugal", 25, 1.80, 100, 13, 2, 3);
        Lutador l6 = new Lutador("Phil", "Canada", 32, 1.70, 120, 8, 1, 4);
        Lutador l7 = new Lutador("Will", "Alaska", 24, 1.75, 69.9, 11, 5, 1);
        Lutador l8 = new Lutador("Luizin", "Brasil", 27, 1.70, 54.8, 14, 1, 3);
        Lutador l9 = new Lutador("Spider", "EUA", 33, 1.76, 75.9, 12, 2, 1);
        Lutador l10 = new Lutador("Gonzalez", "Espanha", 29, 1.72, 79.6, 13, 0, 2);
        Lutador l11 = new Lutador("Hank", "Congo", 31, 1.82, 103.9, 9, 2, 3);
        Lutador l12 = new Lutador("Al Mua Dib", "Irã", 38, 1.83, 110.2, 8, 1, 4);
        
        lutadores.add(l1);
        lutadores.add(l2);
        lutadores.add(l3);
        lutadores.add(l4);
        lutadores.add(l5);
        lutadores.add(l6);
        lutadores.add(l7);
        lutadores.add(l8);
        lutadores.add(l9);
        lutadores.add(l10);
        lutadores.add(l11);
        lutadores.add(l12);

        Luta uec01 = new Luta();
        uec01.marcarLuta(l1,l2);
        uec01.lutar();
        l1.status();
        l2.status();
    
    }
}
