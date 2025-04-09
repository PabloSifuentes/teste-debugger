package ClasseMercado;

public class MainMercado {
    public static void main(String[] args) {

    Mercado unidadeDeBlumenau = new Mercado(
            "Cooperativa",
            2100,
            3.99,
            3322,
            4.50
    );

    Mercado unidadeDeJoinville = new Mercado(
            "Zaanerativa",
            5500,
            2.59,
            6333,
            3.89
    );

    Mercado unidadeDeFlorianopolis = new Mercado(
            "Passerativa",
            10000,
            5.00,
            8211,
            5.99
    );

        System.out.println("MERCADOS:");
        System.out.println("Unidade em Blumenau: \n" + unidadeDeBlumenau.toString() + "\n");
        System.out.println("Unidade em Joinville: \n" + unidadeDeJoinville.toString() + "\n");
        System.out.println("Unidade em Florianópolis: \n" + unidadeDeFlorianopolis.toString() + "\n");
    }
}
