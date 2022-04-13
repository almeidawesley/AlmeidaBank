public class CriaConta {
    public static void main(String[] args) {
       Conta FirstAccount = new Conta(122,345);
        FirstAccount.deposita(200);

       Conta SecondAccount = new Conta(122,999);
       SecondAccount.deposita(2555); 
    }
}
