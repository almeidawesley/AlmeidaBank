public class TestaBanco {
    public static void main(String[] args) {
        
        Cliente wesley = new Cliente();
        wesley.setNome("Wesley"); 
        wesley.setCpf("123456789"); 
        wesley.setProfissao("Dev RPA"); 
        
        Conta conta = new Conta();
        conta.deposita(5000);

       // conta.titular = wesley;

       // System.out.println(conta.titular.nome);
        
    }
}
