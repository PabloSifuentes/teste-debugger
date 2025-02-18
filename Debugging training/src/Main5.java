import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Nome:");
        String nome = entrada.nextLine();
        System.out.printf("Cpf:");
        String cpf = entrada.nextLine();
        System.out.printf("Uf:");
        String uf = entrada.nextLine();
        System.out.printf("Renda Anual:");
        double rendaAnual = entrada.nextDouble();

        Ex5 novoUsuario = new Ex5(nome,cpf,uf,rendaAnual);
        double imposto = novoUsuario.calcularImposto();

        System.out.printf("Nome: " +novoUsuario.getNome());
        System.out.printf("\nCPF: " +novoUsuario.getCpf());
        System.out.printf("\nUF: " +novoUsuario.getUf());
        System.out.printf("\nO imposto será dê: " +imposto);








    }
}