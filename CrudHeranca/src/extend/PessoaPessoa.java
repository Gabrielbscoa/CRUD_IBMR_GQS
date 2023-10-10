package extend;

public class PessoaPessoa {
    // Atributos da classe PessoaPessoa
    private int id;
    private String nome;
    

    // Construtor da classe PessoaPessoa
    public PessoaPessoa(String nome, int idade) {
        this.nome = nome;
        
    }

    // Método getter para o ID
    public int getId() {
        return id;
    }

    // Método setter para o ID
    public void setId(int id) {
        this.id = id;
    }

    // Métodos getters e setters para nome e idade
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

 
    // Método toString para exibir informações da PessoaPessoa
    @Override
    public String toString() {
        return "PessoaPessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                
                '}';
    }
}
