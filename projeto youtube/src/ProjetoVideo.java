import java.util.ArrayList;

public class ProjetoVideo {
    public static void main(String[] args) {
        ArrayList<Video> videos = new ArrayList<>();
        Video v1 = new Video("Aula 1 JAVA POO");
        Video v2 = new Video("Aula 2 JAVA POO");
        Video v3 = new Video("Aula 3 JAVA POO");

        videos.add(v3);
        videos.add(v2);
        videos.add(v1);
        Inscrito i1 = new Inscrito("Luizin", 22, "Masc", "luiz123");
        Inscrito i2 = new Inscrito("Zezin", 25, "Masc", "zeze74");

        System.out.println(i1);
        System.out.println(v1);

        Visualizacao vz = new Visualizacao(i1, v1);
        Visualizacao vx = new Visualizacao(i1, v2);
        Visualizacao vy = new Visualizacao(i2, v1);
        v1.like();
        vz.avaliar();

        System.out.println(vz.toString());
        System.out.println(vx.toString());
        System.out.println(vy.toString());
    }

}


