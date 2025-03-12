package estacaoDeAno;

import java.util.Scanner;

public class Estacao {
    public static void main(String[] args) {

        Scanner estacao = new Scanner(System.in);

         boolean controleOpcao = true;
        while (controleOpcao) {
        System.out.println("[1]- verão\n[2]- Outono\n[3]- Inverno\n[4]- primavera");
        int opcao = estacao.nextInt();

            if (opcao == 4) {
                System.out.println("É primavera, uma bela paisagem em jardins, campos e parques.");
                break;
            }
            if (opcao == 1) {
                System.out.println("É verão, o tempo está quente!");
                break;
            }
            if (opcao == 2) {
                System.out.println("É outono, temperatura amenas e quedas de folhas.");
                break;
            }
            if (opcao == 3) {
                System.out.println("É inverno, está frio!");
                controleOpcao = false;
            } else {
                System.out.println("Erro, número inválido!");
                controleOpcao = true;
            }
        }
            estacao.close();
    }
}
