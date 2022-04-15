public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;
    private static int total;
    //Construtor 
    public Conta(int agencia, int numero){
        total++;
       // System.out.println("O total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
      //  System.out.println("Criando uma conta " + this.numero);

    }


    public void deposita(double valor){
        this.saldo += valor;
    }   

    public boolean saca(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
        return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);;
            return true;
        }else{
            return false;
        }
    }

    public double GetSaldo() {
        return this.saldo;
    }
    
    
    public int GetNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        if(numero <=0){
            System.out.println("o valor nao pode ser menor ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        if(agencia <=0){
            System.out.println("o valor nao pode ser menor ou igual a zero");
            return;
        }
        this.agencia = agencia;
    }

    public static int getTotal() {
        return total;
    }
}