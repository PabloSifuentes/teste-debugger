package parImpar;

import java.util.Scanner;

public class TestarImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         Numero valor = new Numero();

         System.out.println("Dê um valor:\n");
        int x = entrada.nextInt();

        System.out.println(valor.parImpar(x));
    }
}
