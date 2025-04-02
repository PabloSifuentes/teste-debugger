import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_8 {

    public static String Verao(){
        System.out.println("É verão.");
        System.out.println("Está muito quente!");
        return "";
    }
    public static String Outono(){
        System.out.println("É outono.");
        System.out.println("Está muito agradável o clima!");
        return "";
    }
    public static String Inverno(){
        System.out.println("É inverno.");
        System.out.println("É muito frio!");
        return "";
    }
    public static String Primavera(){
        System.out.println("É primavera.");
        System.out.println("Chove muito!");
        return "";
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com uma das opções:\n [1]- Verão\n [2]- Outono\n [3]- Inverno\n [4]- Primavera");
        Integer valor = entrada.nextInt();

        switch (valor){
            case 1:
                Verao();
                break;
            case 2:
                Outono();
                break;
            case 3:
                Inverno();
                break;
            case 4:
                Primavera();
                break;
            default:
                System.out.println("Erro, digita apanes dê 1 a 4.");
    }
}
}
