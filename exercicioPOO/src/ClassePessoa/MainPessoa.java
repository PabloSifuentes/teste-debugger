package ClassePessoa;

public class MainPessoa {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(
                "Paula Barbosa",
                'F',
                "10/05/1985",
                "Casada"
        );

        Pessoa pessoa2 = new Pessoa(
                "Paulo Silva",
                'M',
                "11/06/1988",
                "Solteiro"
        );

        System.out.println("\nPessoa 1:\n " + pessoa1.getNome() + "\n " + pessoa1.getSexo() + "\n " + pessoa1.getDataDeNascimento() + "\n " + pessoa1.getEstadoCivil() + "\n");
        System.out.println("Pessoa 2:\n " + pessoa2.getNome() + "\n " + pessoa2.getSexo() + "\n " + pessoa2.getDataDeNascimento() + "\n " + pessoa2.getEstadoCivil());
    }
}
