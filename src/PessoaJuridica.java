public class PessoaJuridica implements Cliente{
    String nome;

    public PessoaJuridica(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return "Pessoa Jurídica";
    }
}
