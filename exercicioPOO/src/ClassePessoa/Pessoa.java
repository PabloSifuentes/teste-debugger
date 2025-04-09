package ClassePessoa;

public class Pessoa {

    private String nome;
    private char sexo;
    private String dataDeNascimento;
    private String estadoCivil;

    public Pessoa() {
    }

    public Pessoa(String nome, char sexo, String dataDeNascimento, String estadoCivil) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
