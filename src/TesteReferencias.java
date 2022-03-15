public class TesteReferencias {
    public static void main(String[] args) {
        Conta FirstAccount = new Conta();
        FirstAccount.deposita(3500);
        System.out.println("Saldo Primeira conta: " + FirstAccount.GetSaldo());

    }
}
