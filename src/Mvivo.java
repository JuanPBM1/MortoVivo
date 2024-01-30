import java.util.Random;
import java.awt.event.KeyEvent;
import java.time.*;

public class Mvivo {
    public static void start(){
        boolean perdeu = false;
        while (perdeu == false){
            //loop do jogo, chamando os outros métodos
        }
    }
    //Método para escolher aleatoriamente morto ou vivo
    static boolean escolha(){ // Morto = false; Vivo = true
        Random aleatorio = new Random();
        boolean escolha = aleatorio.nextBoolean();
        if (escolha == false){
            System.out.println("Morto!");
        }
        else{
            System.out.println("Vivo!");
        }
        return escolha;
    }

    //Método para determinar o tempo, avisando quando tiver ficando mais rápido. Recebe o número de vitórias e determina a dificuldade a partir disso
    static void dificuldade(int vitorias){
        double diff = vitorias / 0.8; //0.8 foi um número aleatório escolhido
        LocalDateTime timeOut = new LocalDateTime()
    }

    //Método para verificar se o input está correto
    static int inputCorreto(boolean escolha, int inputUser){ //Vai verificar se o input está correto, tendo como argumentos a escolha do programa para a rodada e o respectivo input do usuário.
        int veredito;
        //0 = falso; 1 = verdadeiro; -1 = erro, input incorreto
        if (escolha == false){//se o programa escolher morto
            if(inputUser == KeyEvent.VK_UP){ //se o input do usuário for vivo
                veredito = 0;
            }
            else if (inputUser == KeyEvent.VK_DOWN) { //se o input for morto
                veredito = 1;
            }
            else
                veredito = -1; //erro
        }
        else{ //se o programa ecolher vivo
            if (inputUser == KeyEvent.VK_UP){ //se o input for vivo
                veredito = 1;
            }
            else if (inputUser == KeyEvent.VK_DOWN) { //se o input for morto
                veredito = 0;
            }
            else
                veredito = -1; //erro
        }

        return veredito;
    }

    //Método que adiciona pontos ao jogador

    //Método que salva o score do player quando ele perde e diz a ele
}
