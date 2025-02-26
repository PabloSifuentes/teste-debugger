import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner estacao = new Scanner(System.in);
        boolean controleOpcao = true;

        while (controleOpcao) {
            System.out.println("[1]- verão\n[2]- Outono\n[3]- Inverno\n[4]- primavera");
            int opcao = estacao.nextInt();
            System.out.println("Dê dois valores para calcular:\n");
            double x = estacao.nextDouble();
            double y = estacao.nextDouble();

            Calculadora calcular = new Calculadora(x, y);

            System.out.println("[Soma]\n[Subtração]\n[Multiplicação]\n[Divisão]");
            String calculo = estacao.nextLine();
            double resultado;

            while (controleOpcao) {
                switch (calculo) {
                    case "Soma":
                        resultado = calcular.somar();
                        System.out.println("Resultado: " + resultado);
                        controleOpcao = false;
                    case "Subtração":
                        resultado = calcular.subtracao();
                        System.out.println("Resultado: " + resultado);

                    case "Multiplicação":
                        resultado = calcular.multiplicar();
                        System.out.println("Resultado; " + resultado);

                    case "Divisão":
                        resultado = calcular.divisao();
                        System.out.println("Resultado: " + resultado);

                    default:
                        System.out.println("Erro! tenta novamente.");
                        controleOpcao = true;
                }
            }
            if (opcao == 4) {
                System.out.println("É primavera, uma bela paisagem em jardins, campos e parques.");
                if (opcao % 2 == 0){
                    System.out.println("Número é par!");
                } else {
                    System.out.println("Número é ímpar");
                }
                controleOpcao = false;
            } else if (opcao == 1) {
                System.out.println("É verão, o tempo está quente!");
                if (opcao % 2 == 0){
                    System.out.println("Número é par!");
                } else {
                    System.out.println("Número é ímpar");
                }
                controleOpcao = false;
            } else if (opcao == 2) {
                System.out.println("É outono, temperatura amenas e quedas de folhas.");
                if (opcao % 2 == 0){
                    System.out.println("Número é par!");
                } else {
                    System.out.println("Número é ímpar");
                }
                controleOpcao = false;
            } else if (opcao == 3) {
                System.out.println("É inverno, está frio!");
                if (opcao % 2 == 0){
                    System.out.println("Número é par!");
                } else {
                    System.out.println("Número é ímpar");
                }
                controleOpcao = false;
            } else {
                System.out.println("Opção inválida, tente novamente!");
                controleOpcao = true;
            }
        }
    }
}
