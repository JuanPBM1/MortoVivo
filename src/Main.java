import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        boolean game = true;
        Scanner scan = new Scanner(in);
        while (game == true) {
            System.out.print("\t\tMorto-Vivo\t\t\n");
            System.out.print("Selecione uma opção:\n\n");
            System.out.print("[1] Tutorial/controles\n");
            System.out.print("[2] Iniciar jogo\n");
            System.out.print("[3] Highscores\n");
            System.out.print("[4] Sair do jogo\n");
            int opcao = scan.nextInt();
            scan.nextLine();
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
                    game = false;
                break;

                default:
                    limpaConsole();
                    System.out.print("Número inválido!\nDigite qualquer tecla para continuar\n\n");
                    scan.nextLine();

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