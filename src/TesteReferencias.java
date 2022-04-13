public class TesteReferencias {
    public static void main(String[] args) {
        Conta FirstAccount = new Conta(122,789);
        FirstAccount.deposita(3500);
        System.out.println("Saldo Primeira conta: " + FirstAccount.GetSaldo());

    }
}
