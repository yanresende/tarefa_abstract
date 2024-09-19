public class PessoaF extends Pessoa {

    private long cpf;

    @Override
    public String toString() {

        return "Pessoa Fisica: Nome: " + getNome() + " " + getSobrenome() + " e com o cpf: " + getCpf();
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }
}
