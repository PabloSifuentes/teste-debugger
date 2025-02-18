public class Main6 {

    public static void main(String[] args) {


        Ex6 barro = new Ex6("areia", "areia de contrucao", 20, 50, 50);

        barro.adicionarEstoque(1);
        System.out.println(barro.getEstoque());

        barro.aplicarPromocao(20);
        System.out.println(barro.getPreco());

    }
}
