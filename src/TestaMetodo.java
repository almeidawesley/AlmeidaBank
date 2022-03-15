public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(200); 
        conta.deposita(50);
        System.out.println(conta.GetSaldo());

        Conta conta2 = new Conta();
        conta2.deposita(5000);

        conta2.transfere(2000, conta);

        System.out.println(conta.GetSaldo());
    }
}
