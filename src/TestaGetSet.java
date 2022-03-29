public class TestaGetSet {
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1000);
        System.out.println(conta.GetNumero());
        
        Cliente wesley = new Cliente();
        wesley.setNome("Wesley Almeida");
        conta.setTitular(wesley);

        System.out.println(conta.getTitular().getNome());
    }
}
