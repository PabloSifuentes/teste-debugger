package areaPerimetro;

import java.util.ArrayList;
import java.util.Scanner;

public class area {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        ArrayList<Retangulo> lista = new ArrayList<>();

        System.out.println("Insira os dados:\n");
        System.out.println("Largura:");
        Double largura = dados.nextDouble();
        System.out.println("Altura:");
        Double altura = dados.nextDouble();

        Retangulo retangulo = new Retangulo(altura, largura);

        Retangulo maiorArea = lista.get(0);
        Retangulo maiorPerimetro = lista.get(0);

        for(Retangulo r = lista){
            
        }

    }
}
