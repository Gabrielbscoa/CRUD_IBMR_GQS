package extend;

public class PessoaJuridica extends Pessoa {
    // Atributos espec�ficos da classe PessoaJuridica
    private String cnpj;
    

    // Construtor da classe PessoaJuridica
    public PessoaJuridica(String nome, int idade, String cnpj, String razaoSocial) {
        super(nome, idade);
        this.cnpj = cnpj;
      
    }

    // M�todo getter para o CNPJ
    public String getCnpj() {
        return cnpj;
    }

    // M�todo setter para o CNPJ
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

  

 
    // M�todo toString para exibir informa��es da PessoaJuridica
    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
