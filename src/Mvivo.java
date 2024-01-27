import java.util.Random;
public class Mvivo {
    public static void start(){
        boolean perdeu = false;
        while (perdeu == false){
            //loop do jogo, chamando os outros métodos
        }
    }
    //Método para escolher aleatoriamente morto ou vivo
    static boolean escolha(){ // 0 = false; 1 = true
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
    /*static void dificuldade(int vitorias){
        int diff = vitorias *
    }*/
    //Método para verificar se o input está correto

    //Método que adiciona pontos ao jogador

    //Método que salva o score do player quando ele perde e diz a ele
}
