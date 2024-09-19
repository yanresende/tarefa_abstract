public class Aplicacao {
    public static void main(String[] args) {
        PessoaF pessoa = new PessoaF();
        pessoa.setNome("Yan");
        pessoa.setSobrenome("Resende");
        pessoa.setCpf(123456789);
        System.out.println(pessoa);
        
        PessoaJ pessoa2 = new PessoaJ();
        pessoa2.setNome("Sabrina");
        pessoa2.setSobrenome("Londero");
        pessoa2.setCnpj(987654321);
        System.out.println(pessoa2);
    }
}
