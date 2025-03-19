import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Preencha as informações há baixo:\n Nome: \n titular:");
        String nome = entrada.nextLine();
        String titular = entrada.nextLine();
        conta.setNome(nome);
        conta.setTitular(titular);

        System.out.println("Insira valor a ser depositado:");
        Integer valor = entrada.nextInt();
        conta.depositar(valor);
        System.out.println("saldo:"+conta.getSaldo());

        System.out.println("Dê o valor a ser sacado:");
        Integer valor2 = entrada.nextInt();
        if (valor2 > conta.getSaldo()){
            System.out.println("erro, saldo insuficiente!");
            entrada.close();
        }
        System.out.println("saldo:" + conta.getSaldo() + "-" + conta.sacar(valor2));
        System.out.println("Saldo atual:" + conta.getSaldo());

        System.out.println("Insira o titular e o valor para fazer trasnferência:\n titular:\nvalor:");
        Integer valor4 = entrada.nextInt();
        if (valor4 > conta.getSaldo()) {
            System.out.println("erro, saldo insuficiente!");
            entrada.close();
        } else {
            conta.transferir(valor4, valor4);
            System.out.println("Transferência concluida!");
            System.out.println("Saldo:" + conta.getSaldo());
        }
    entrada.close();
    }
}