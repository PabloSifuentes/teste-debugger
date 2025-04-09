package ClasseProduto;

public class Produto {
    private String nome;
    private String Descricao;
    private Double precoUnitario;
    private Double desconto;

    public Produto() {
    }

    public Produto(String nome, String descricao, Double precoUnitario, Double desconto) {
        this.nome = nome;
        Descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return " nome='" + nome + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", precoUnitario=" + precoUnitario +
                ", desconto=" + desconto +
                ".";
    }
}
