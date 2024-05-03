
import java.util.*;

public class Luta {
    
        private Lutador desafiante;
        private Lutador desafiado;
        private int rounds;
        private boolean aprovada;

        public Lutador getDesafiante() {
            return desafiante;
        }

        public void setDesafiante(Lutador desafiante) {
            this.desafiante = desafiante;
        }

        public Lutador getDesafiado() {
            return desafiado;
        }

        public void setDesafiado(Lutador desafiado) {
            this.desafiado = desafiado;
        }

        public int getRounds() {
            return rounds;
        }

        public void setRounds(int round) {
            this.rounds = round;
        }

        public boolean getAprovada() {
            return aprovada;
        }

        public void setAprovada(boolean aprovada) {
            this.aprovada = aprovada;
        }

        public void marcarLuta(Lutador l1, Lutador l2){
            desafiante=l1;
            desafiado=l2;
            if (desafiante.getCategoria() == desafiado.getCategoria() &&
                desafiante != desafiado) {
                setAprovada(true);
                System.out.println("Luta marcada com sucesso");
            }
            else {
                setAprovada(false);
                this.desafiado=null;
                this.desafiante=null;
                System.out.println("Operação invalida");
            };
        }
    
        public void lutar(){ //Utilizei um randomizador pra aleatorizar quem ganha a luta
            if (aprovada) {
                
            int resultado;
            desafiante.apresentar();
            desafiado.apresentar();
            Random j = new Random();
            setRounds(j.nextInt(5)+1);
            Random r = new Random();
            resultado = r.nextInt(3);
            if (resultado == 0) {
                System.out.println("O vencedor é " + desafiante.getNome() + " com " + getRounds() + " Round(s).");
                desafiante.ganharLuta();
                desafiado.perderLuta();
            }
            else if (resultado == 1) {
                System.out.println("O vencedor é " + desafiado.getNome() + " com " + getRounds() + " Round(s).");
                desafiado.ganharLuta();
                desafiante.perderLuta();
            }
            else if (resultado == 2) {
                System.out.println("O desafio de hoje terminou em EMPATE com " + getRounds() + " Round(s).");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
            } else {
                System.out.println("ERRO");
            }
        }else{
            System.out.println("A Luta não pode acontecer");
        }
        }

        @Override
        public String toString() {
            return  "Desafiante: " + desafiante + 
                    "\n Desafiado: " + desafiado + 
                    "\n rounds: " + rounds + 
                    "\n Aprovada: " + aprovada;
        }

}

