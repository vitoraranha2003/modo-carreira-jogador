package Futebol;

import java.util.Scanner;

public class Carreira {
    public static void main(String[] args) {
        Jogador Vitor = new Jogador("Vitor", 19, "brasileiro",
                "Flamengo", 7, "PE", 288, 140, 3,
                0, 3);
        System.out.println("Seja Bem-Vindo!");
        while (true) {
            System.out.println("=================================");
            System.out.println("[0] Mostrar dados do seu jogador");
            System.out.println("[1] Criar carta no Fifa");
            System.out.println("[2] Treinar penaltis ");
            System.out.println("[3] Aposentar");
            System.out.println("[4] Sair do programa");
            System.out.println("=================================");
            Scanner escolha_scanner = new Scanner(System.in);
            System.out.print("O que voce deseja fazer?");
            Integer escolha = escolha_scanner.nextInt();
            if (escolha == 0) {
                Vitor.mostrarDados();
            }
            if (escolha == 1){
                Vitor.criarCartaNoFifa();
            }
            if (escolha == 2) {
                Vitor.treinarPenaltis();
            }
            if (escolha == 3) {
                Vitor.aposentar();
            }
            if (escolha==4){
                System.out.println("Fim do programa.");
                break;
            }
        }
    }
}