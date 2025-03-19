public class Conta {

    private String nome;
    private String titular;
    private Integer saldo = 0;

    public Conta() {
    }

    public Conta(String nome, String titular, Integer saldo) {
        this.nome = nome;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer sacar(Integer valor){
       saldo = saldo - valor;
       return valor;
    }

    public Integer depositar(Integer valor){
       return saldo = valor + saldo;
    }

    public Integer transferir(Integer valor, Conta conta2){
        conta2.setSaldo(conta2.getSaldo() + valor);
        saldo = saldo - valor;
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
