import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double somaAltura = 0;
        int contador = 0;
        double altura;
        while (true) {
            contador++;
            System.out.println("Insira a altura");
            altura = input.nextDouble();
            if (altura > 0) {
                somaAltura++;
            } else {
                break;
            }
        }
        double media = altura / contador;
        System.out.println(media);
    }
    }