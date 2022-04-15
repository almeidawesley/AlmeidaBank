public class CriaConta {
    public static void main(String[] args) {
       Conta FirstAccount = new Conta(123,345);
        FirstAccount.deposita(200);

       Conta SecondAccount = new Conta(123,999);
       SecondAccount.deposita(2555); 
    }
}
