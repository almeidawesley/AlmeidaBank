public class TestaValores {
    public static void main(String[] args) {
        
        Conta conta = new Conta(1338,24226);
        System.out.println(conta.getAgencia());
       
        conta.setAgencia(123);
        System.out.println("Total:" + Conta.getTotal());
    }
}
