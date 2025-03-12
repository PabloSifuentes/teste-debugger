package calculador;

public class Calculadora {

    private double valor1;
    private double valor2;

    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Calculadora(){
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double somar(){
        return valor1 + valor2;
    }
    public double subtracao(){
        return valor1 - valor2;
    }
    public double multiplicar(){
        return valor1 * valor2;
    }
    public double divisao(){
        if (valor1 == 0 || valor2 == 0) {
            System.out.println("Erro: Não é possível dividir por zero! Tente novamente.");
            return Double.NaN; //indica erro!
        }
        return valor1 / valor2;
    }
}
