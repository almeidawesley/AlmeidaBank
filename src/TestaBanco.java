public class TestaBanco {
    public static void main(String[] args) {
        
        Cliente wesley = new Cliente();
        wesley.nome = "Wesley";
        wesley.cpf = "123456789";
        wesley.profissao = "Dev RPA";
        
        Conta conta = new Conta(122,889);
        conta.deposita(5000);

       // conta.titular = wesley;

      //  System.out.println(conta.titular.nome);
        
    }
}
