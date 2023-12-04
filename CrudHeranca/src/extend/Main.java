public class Main {
    public static void main(String[] args) {
        
        PessoaPessoa operacoesPessoaFisica = new PessoaFisica("João", 123456789);
        operacoesPessoaFisica.criar();
        operacoesPessoaFisica.ler();

        PessoaPessoa operacoesPessoaJuridica = new PessoaJuridica("Empresa XYZ", 987654321);
        operacoesPessoaJuridica.criar();
        operacoesPessoaJuridica.ler();
    }
}
