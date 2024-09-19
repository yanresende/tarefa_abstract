public class PessoaJ extends Pessoa{
    
    private long cnpj;

    @Override
    public String toString() {

        return "Pessoa Juridica: Nome: " + getNome() + " " + getSobrenome() + " e com o cpf: " + getCnpj();
    }

    public void setCnpj(long cnpj){
        this.cnpj = cnpj;
    }

    public long getCnpj(){
        return cnpj;
    }
}
