package IMC;

import java.util.Scanner;

public class ClassificarImc {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.printf("Informe os seguintes dados:\nIdade:\nAltura:\nPeso:\n");
        Integer idade = dados.nextInt();
        Double altura = dados.nextDouble();
        Double peso = dados.nextDouble();

        Atleta usuario = new Atleta(idade, altura, peso);

        boolean controleWhile = true;
        while (controleWhile) {
            if (usuario.getIdade() >= 5 || usuario.getIdade() <= 7) {
                Double resultado = usuario.IMC();
                System.out.println("pré-mirim 5 - 7 anos");

                if (resultado < 18.5) {
                    System.out.println("Magreza");
                    break;
                } else if (resultado >= 18.5 || resultado <= 24.9) {
                    System.out.println("Saudável");
                    break;
                } else if (resultado == 25.0 || resultado <= 29.9) {
                    System.out.printf("Sobrepeso");
                    break;
                } else if (resultado == 30.0 || resultado <= 34.9) {
                    System.out.println("Obesidade Grau 1");
                    break;
                } else if (resultado == 35.0 || resultado <= 39.9) {
                    System.out.println("Obesidade Grau 2(severa)");
                    break;
                } else if (resultado > 40.0) {
                    System.out.println("Obesidade Grau 3(morbida)");
                    break;
                }
            }
            if (usuario.getIdade() >= 8 || usuario.getIdade() <= 10) {
                Double resultado = usuario.IMC();
                System.out.println("mirim 8 - 10 anos");

                if (resultado < 18.5) {
                    System.out.println("Magreza");
                    break;
                } else if (resultado >= 18.5 || resultado <= 24.9) {
                    System.out.println("Saudável");
                    break;
                } else if (resultado == 25.0 || resultado <= 29.9) {
                    System.out.printf("Sobrepeso");
                    break;
                } else if (resultado == 30.0 || resultado <= 34.9) {
                    System.out.println("Obesidade Grau 1");
                    break;
                } else if (resultado == 35.0 || resultado <= 39.9) {
                    System.out.println("Obesidade Grau 2(severa)");
                    break;
                } else if (resultado > 40.0) {
                    System.out.println("Obesidade Grau 3(morbida)");
                    break;
                }
            }
            if (usuario.getIdade() >= 11 || usuario.getIdade() <= 13) {
                Double resultado = usuario.IMC();
                System.out.println("infantil 11 - 13 anos");

                if (resultado < 18.5) {
                    System.out.println("Magreza");
                    break;
                } else if (resultado >= 18.5 || resultado <= 24.9) {
                    System.out.println("Saudável");
                    break;
                } else if (resultado == 25.0 || resultado <= 29.9) {
                    System.out.printf("Sobrepeso");
                    break;
                } else if (resultado == 30.0 || resultado <= 34.9) {
                    System.out.println("Obesidade Grau 1");
                    break;
                } else if (resultado == 35.0 || resultado <= 39.9) {
                    System.out.println("Obesidade Grau 2(severa)");
                    break;
                } else if (resultado > 40.0) {
                    System.out.println("Obesidade Grau 3(morbida)");
                    break;
                }
            }
            if (usuario.getIdade() >= 14 || usuario.getIdade() <= 17) {
                Double resultado = usuario.IMC();
                System.out.println("infanto-juvenil 14 - 17 anos");

                if (resultado < 18.5) {
                    System.out.println("Magreza");
                    break;
                } else if (resultado >= 18.5 || resultado <= 24.9) {
                    System.out.println("Saudável");
                    break;
                } else if (resultado == 25.0 || resultado <= 29.9) {
                    System.out.printf("Sobrepeso");
                    break;
                } else if (resultado == 30.0 || resultado <= 34.9) {
                    System.out.println("Obesidade Grau 1");
                    break;
                } else if (resultado == 35.0 || resultado <= 39.9) {
                    System.out.println("Obesidade Grau 2(severa)");
                    break;
                } else if (resultado > 40.0) {
                    System.out.println("Obesidade Grau 3(morbida)");
                    break;
                }
            }
            if (usuario.getIdade() >= 18 || usuario.getIdade() <= 20) {
                Double resultado = usuario.IMC();
                System.out.println("juvenil 18 - 20 anos");

                if (resultado < 18.5) {
                    System.out.println("Magreza");
                    break;
                } else if (resultado >= 18.5 || resultado <= 24.9) {
                    System.out.println("Saudável");
                    break;
                } else if (resultado == 25.0 || resultado <= 29.9) {
                    System.out.printf("Sobrepeso");
                    break;
                } else if (resultado == 30.0 || resultado <= 34.9) {
                    System.out.println("Obesidade Grau 1");
                    break;
                } else if (resultado == 35.0 || resultado <= 39.9) {
                    System.out.println("Obesidade Grau 2(severa)");
                    break;
                } else if (resultado > 40.0) {
                    System.out.println("Obesidade Grau 3(morbida)");
                    break;
                }
            }
            if (usuario.getIdade() >= 21) {
                Double resultado = usuario.IMC();
                System.out.println("adulto maiores de 21 anos");

                if (resultado < 18.5) {
                    System.out.println("Magreza");
                    break;
                } else if (resultado >= 18.5 || resultado <= 24.9) {
                    System.out.println("Saudável");
                    break;
                } else if (resultado == 25.0 || resultado <= 29.9) {
                    System.out.printf("Sobrepeso");
                    break;
                } else if (resultado == 30.0 || resultado <= 34.9) {
                    System.out.println("Obesidade Grau 1");
                    break;
                } else if (resultado == 35.0 || resultado <= 39.9) {
                    System.out.println("Obesidade Grau 2(severa)");
                    break;
                } else if (resultado > 40.0) {
                    System.out.println("Obesidade Grau 3(morbida)");
                    break;
                }
            }
        }
            dados.close();
    }
}
