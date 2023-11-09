package extend;

public class PessoaPessoa {

    private String nome;
    private int idade;

    // Construtor da classe PessoaPessoa
    public PessoaPessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

 
    @Override
    public String toString() {
        return "PessoaPessoa{" +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
