import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean game = true;
        Scanner scan = new Scanner(System.in);
        int opcao;
        while (game == true) {
            System.out.print("\t\tMorto-Vivo\t\t\n");
            System.out.print("Selecione uma opção:\n\n");
            System.out.print("[1] Tutorial/controles\n");
            System.out.print("[2] Iniciar jogo\n");
            System.out.print("[3] Highscores\n");
            System.out.print("[4] Sair do jogo\n");
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    //xxx
                break;
                case 2:
                    //xxx
                break;
                case 3:
                    //xxx
                break;
                case 4:
                    //xxx
                break;

                default:
                    limpaConsole();
            }
        }
    }

    public static void limpaConsole(){
        try {
            Runtime.getRuntime().exec("clear");

        }
        catch(final Exception e){
            System.out.print("ERRO! Não foi possível limpar o console!\n");
        }
    }
}