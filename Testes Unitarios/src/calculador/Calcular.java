package calculador;

import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {

        Scanner estacao = new Scanner(System.in);
        boolean controleOpcao = true;

        while (controleOpcao) {
            System.out.println("Dê dois valores para calcular:\n");
            double x = estacao.nextDouble();
            double y = estacao.nextDouble();

            Calculadora calcular = new Calculadora(x, y);

            System.out.println("[Soma]\n[Subtração]\n[Multiplicação]\n[Divisão]");
            String calculo = estacao.nextLine();
            double resultado;

                switch (calculo) {
                    case "Soma":
                        resultado = calcular.somar();
                        System.out.println("Resultado: " + resultado);
                        break;

                    case "Subtração":
                        resultado = calcular.subtracao();
                        System.out.println("Resultado: " + resultado);
                        break;

                    case "Multiplicação":
                        resultado = calcular.multiplicar();
                        System.out.println("Resultado; " + resultado);
                        break;

                    case "Divisão":
                        resultado = calcular.divisao();
                        System.out.println("Resultado: " + resultado);
                        break;

                    default:
                        System.out.println("Erro! tenta novamente.");
                }
        }
    }
}
