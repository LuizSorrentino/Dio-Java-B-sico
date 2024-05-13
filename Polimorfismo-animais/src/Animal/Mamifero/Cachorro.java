package Animal.Mamifero;

public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }

    public void reagir(String frase){
        if (frase == "toma comida" || frase == "ola") {
            abanarRabo();
            System.out.println("Latir");
        }else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(boolean dono){
        if (dono) {
            abanarRabo();
        }else{
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int hora, int min){
        if (hora<12 && hora>=6) {
            abanarRabo();

        }else if (hora<18 && hora>=12) {
            abanarRabo();
            System.out.println("Latir");

        }else if (hora>=18) {
            System.out.println("ignorando");
        }
    }

    public void reagir(int idade, float peso){
        if (idade<=5) {
            if (peso<10) {
                abanarRabo();
            }else{
                System.out.println("Latir");
            }
        }else{
            if (peso<10) {
                System.out.println("Rosnar");
            }else{
                System.out.println("ignorar");
            }
        }
    }

}
