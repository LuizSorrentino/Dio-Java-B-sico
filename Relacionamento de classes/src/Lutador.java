public class Lutador {
private String nome;
private String nacionalidade;
private int idade;
private double altura;
private double peso;
private String categoria;
private int vitorias; 
private int derrotas;
private int empates;

@Override
public String toString(){
    return  "Lutador " + getNome() + "\n" +
            "Origem " + getNacionalidade() + "\n" +
            getIdade() + " anos \n" +
            getAltura() + " de altura \n" +
            "Pesando " + getPeso() + "Kg \n" +
            getVitorias() + " Vitorias \n" +
            getDerrotas() + " Derrotas \n" +
            getEmpates() + " Empate";

}

public void apresentar(){
    System.out.println("CHEGOU A HORA!!! É uma honra apresentarmos ooooo: ");
    System.out.println("Lutador " + getNome());
    System.out.println("Origem " + getNacionalidade());
    System.out.println(getIdade() + " anos");
    System.out.println(getAltura() + " de altura");
    System.out.println("Pesando " + getPeso() + "Kg");
    System.out.println(getVitorias() + " Vitorias");
    System.out.println(getDerrotas() + " Derrotas");
    System.out.println(getEmpates() + " Empates");
}

public void status() {
    System.out.println(getNome() + " é um peso " +getCategoria());
    System.out.println(getVitorias() + " Vitorias");
    System.out.println(getDerrotas() + " Derrotas");
    System.out.println(getEmpates() + " Empates");
}

public void ganharLuta(){
    setVitorias(getVitorias()+1);
}

public void perderLuta(){
    setDerrotas((getDerrotas()+1));
}

public void empatarLuta(){
    setEmpates(getEmpates()+1);
}

public Lutador(String nome, String nacionalidade, int idade, double altura, 
               double peso, int vitorias, int derrotas, int empates) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
    setPeso(peso);
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
}

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}

public String getNacionalidade() {
    return nacionalidade;
}
public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
}

public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}

public double getAltura() {
    return altura;
}
public void setAltura(double altura) {
    this.altura = altura;
}

public double getPeso() {
    return peso;
}
public void setPeso(double peso) {
    this.peso = peso;
    setCategoria();
}

public String getCategoria() {
    return categoria;
}
private void setCategoria() {
    if (peso<52.2) {
        categoria="Invalido";
    } else if(peso<=73.3){
        categoria="Leve";
    } else if(peso<=83.9){
        categoria="Medio";
    } else if (peso<=120.2) {
        categoria="Pesado";
    }else{
        categoria="Invalido";
    }
}

public int getVitorias() {
    return vitorias;
}
public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
}

public int getDerrotas() {
    return derrotas;
}
public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
}

public int getEmpates() {
    return empates;
}
public void setEmpates(int empates) {
    this.empates = empates;
}
}
