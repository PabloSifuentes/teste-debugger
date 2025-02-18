public class Ex5 {
    // Teste o codigo na main em outra classe
    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    public Ex5(String nome, String cpf, String uf, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setUf(uf);
        setRendaAnual(rendaAnual);
    }

    public Ex5() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual >= 0) {
            this.rendaAnual = rendaAnual;      //BUG Esse metodo estava zerando a renda sempre que ela for maior ou igual a 0.
        }
    }

    public double calcularImposto() {
        double aliquota;

        if (rendaAnual <= 4000) { //BUG (Estáva ">=", sendo de forma errada para 0 até 4000)
            aliquota = 0.0;
        } else if (rendaAnual <= 9000) {
            aliquota = 0.58;
        } else if (rendaAnual <= 25000) {
            aliquota = 0.15;
        } else if (rendaAnual <= 35000) {
            aliquota = 0.275;
        } else {
        aliquota = 0.30;
        }

        return rendaAnual * aliquota;
    }

}
