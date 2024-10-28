package crud;

import java.util.Scanner;


public class Executora {

    public static void main(String[] args) {
        JogadoresCRUD jogCRUD = new JogadoresCRUD();
        jogCRUD.connectionDB();

        Scanner scanner = new Scanner(System.in);


        System.out.print("Escolha uma opcao: \n");
        System.out.print("Adicionar Jogador [1] \n");
        System.out.print("Visualizar Jogador[2] \n");
        System.out.print("Atualizar Jogador[3] \n");
        System.out.print("Deletar Jogador[4] \n");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o id do Jogador: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Digite o nome do Jogador: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o ano de treino do Jogador: ");
                int anoTreino = scanner.nextInt();
                System.out.print("Digite o salario do Jogador: ");
                float salario = scanner.nextFloat();

                if(anoTreino > 5){
                    //veterano
                    JogadoresVeteranos jogador = new JogadoresVeteranos(id, nome, anoTreino, salario);
                    jogCRUD.createJogadoresVeteranos(jogador); // adicionar aumento salario
                }else{
                    JogadoresTrainees jogador = new JogadoresTrainees(id, nome, anoTreino, salario);
                    jogCRUD.createJogadoresTrainees(jogador);
                }

                break;
            case 2:
                jogCRUD.readJogadoresVeteranos();
                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("Número inválido! Por favor, digite um núm......");
                break;
        }

    }

}
