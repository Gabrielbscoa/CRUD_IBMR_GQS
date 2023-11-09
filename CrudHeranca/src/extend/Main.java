package extend;

public class Main {
    public static void main(String[] args) {
        
        PessoaFisica pessoaFisica = new PessoaFisica("Maria", 25, "123.456.789-00");
        System.out.println("Pessoa Física:");
        System.out.println(pessoaFisica.toString());

       
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", 10, "12345/0001-67", "XYZ Ltda");
        System.out.println("\nPessoa Jurídica:");
        System.out.println(pessoaJuridica.toString());

       
        Pessoa pessoa = new Pessoa("João", 30);
        System.out.println("\nPessoa Comum:");
        System.out.println(pessoa.toString());

       
        PessoaPessoa pessoaPessoa = new PessoaPessoa("Ana", 40);
        System.out.println("\nPessoa Pessoa:");
        System.out.println(pessoaPessoa.toString());
    }
}
