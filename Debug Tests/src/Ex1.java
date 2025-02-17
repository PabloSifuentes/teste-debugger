import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double somaAltura = 0;
        int contador = 0;
        double altura;
        while (true) {
            System.out.println("Insira a altura");
            altura = input.nextDouble();
            if (altura > 0) {
                somaAltura += altura;
                contador++;
            } else {
                break;
            }
        }
        double media = somaAltura / contador;
        System.out.println(media);
    }

}
