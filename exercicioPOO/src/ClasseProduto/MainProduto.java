package ClasseProduto;

public class MainProduto {

    public static void main(String[] args) {

        Produto produto1 = new Produto(
                "Caderno",
                "Caderno em espiral tamanho médio",
                4.50,
                15.00
        );

        Produto produto2 = new Produto(
                "Caneta",
                "Caneta esferográfica 5mm",
                1.20,
                2.0
        );

        Produto produto3 = new Produto(
                "Esquadro",
                "Esquadro de acrílico 20cm",
                2.35,
                10.00
        );

        System.out.println(produto1.toString() + "\n");
        System.out.println(produto2.toString() + "\n");
        System.out.println(produto3.toString());

    }
}
