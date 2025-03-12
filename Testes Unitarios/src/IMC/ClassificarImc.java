package IMC;

import java.util.Scanner;

public class ClassificarImc {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Informe os seguintes dados:\nIdade:\nAltura:\nPeso:\n");
        Integer idade = dados.nextInt();
        Double altura = dados.nextDouble();
        Double peso = dados.nextDouble();

        Atleta usuario = new Atleta(idade, altura, peso);

        Double resultado = usuario.IMC();

        String faixaEtaria = definirFaixaEtaria(idade);
        System.out.println(faixaEtaria);

        classificarIMC(resultado);

        dados.close();
    }

    public static String definirFaixaEtaria(Integer idade) {
        if (idade >= 5 && idade <= 7) return "pré-mirim 5 - 7 anos";
        if (idade >= 8 && idade <= 10) return "mirim 8 - 10 anos";
        if (idade >= 11 && idade <= 13) return "infantil 11 - 13 anos";
        if (idade >= 14 && idade <= 17) return "infanto-juvenil 14 - 17 anos";
        if (idade >= 18 && idade <= 20) return "juvenil 18 - 20 anos";
        if (idade >= 21) return "adulto maiores de 21 anos";
        return "Idade fora das categorias!";
    }

    public static void classificarIMC(Double imc) {
        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Saudável");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau 1");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau 2 (severa)");
        } else {
            System.out.println("Obesidade Grau 3 (mórbida)");
        }
    }
}
