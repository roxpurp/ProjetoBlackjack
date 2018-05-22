package jogoblackjack.controller;

import java.util.Scanner;
import jogoblackjack.model.Jogador;

public class ControllerMenu {

    Scanner scan = new Scanner(System.in);
    Controller controller;
    Jogador jogador;

    public void Menu() {
        int opcao;
        int sair = 1;

        do {
            System.out.println("[1] - Cadastrar jogadores [2] - Iniciar Partida [0] - Sair");
            opcao = Integer.parseInt(scan.nextLine());
            switch (opcao) {

                case 1:
                    cadastrarPessoa();
                    break;
                case 2:
                    iniciarPartida();
                    break;
                case 3:
                    sair = 0;
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (sair == 1);
    }

    private void cadastrarPessoa() {
        System.out.println("Digite o user do Jogador:");
        jogador.setUser(scan.nextLine());
        System.out.println("Digite a senha do Jogador:");
        jogador.setSenha(scan.nextLine());

        controller.addJogador(jogador);
    }

    private void iniciarPartida() {
    }
}