package IMC;

public class Atleta {

    private Integer idade;
    private Double altura;
    private Double peso;

    public Atleta(){
    }

    public Atleta(Integer idade, Double altura, Double peso) {
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public double IMC (){
        return peso / (altura * 2);
    }
    @Override
    public String toString() {
        return "atleta{" +
                "idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
