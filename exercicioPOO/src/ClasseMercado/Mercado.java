package ClasseMercado;

public class Mercado {

    private String nomeMercado;
    private Integer numeroDeMacasPorAno;
    private Double precoMacas;
    private Integer numeroDeLaranjaPorAno;
    private Double precoLaranja;

    public Mercado() {
    }
    public Mercado(String nomeMercado, Integer numeroDeMacasPorAno, Double precoMacas, Integer numeroDeLaranjaPorAno, Double precoLaranja) {
        this.nomeMercado = nomeMercado;
        this.numeroDeMacasPorAno = numeroDeMacasPorAno;
        this.precoMacas = precoMacas;
        this.numeroDeLaranjaPorAno = numeroDeLaranjaPorAno;
        this.precoLaranja = precoLaranja;
    }

    public String getNomeMercado() {
        return nomeMercado;
    }

    public void setNomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }

    public Integer getNumeroDeMacasPorAno() {
        return numeroDeMacasPorAno;
    }

    public void setNumeroDeMacasPorAno(Integer numeroDeMacasPorAno) {
        this.numeroDeMacasPorAno = numeroDeMacasPorAno;
    }

    public Double getPrecoMacas() {
        return precoMacas;
    }

    public void setPrecoMacas(Double precoMacas) {
        this.precoMacas = precoMacas;
    }

    public Integer getNumeroDeLaranjaPorAno() {
        return numeroDeLaranjaPorAno;
    }

    public void setNumeroDeLaranjaPorAno(Integer numeroDeLaranjaPorAno) {
        this.numeroDeLaranjaPorAno = numeroDeLaranjaPorAno;
    }

    public Double getPrecoLaranja() {
        return precoLaranja;
    }

    public void setPrecoLaranja(Double precoLaranja) {
        this.precoLaranja = precoLaranja;
    }

    @Override
    public String toString() {
        return " nomeMercado='" + nomeMercado + '\'' +
                ",\n numeroDeMacasPorAno=" + numeroDeMacasPorAno +
                ",\n precoMacas=" + precoMacas +
                ",\n numeroDeLaranjaPorAno=" + numeroDeLaranjaPorAno +
                ",\n precoLaranja=" + precoLaranja +
                '}';
    }
}
