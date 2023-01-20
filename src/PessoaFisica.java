public class PessoaFisica implements Cliente{
    String nome;

    public PessoaFisica(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getTipo() {
        return "Pessoa Física";
    }
}
