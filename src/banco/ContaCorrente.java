package banco;

/**
 *
 * @author guilhermepontes
 */

public class ContaCorrente implements iContaCorrente {
    
    private int conta, agencia;
    private double saldo, limite;

    public ContaCorrente(){

    }

    public ContaCorrente (int c, int a, double l){
       this.conta = c;
       this.agencia = a;
       this.limite = l;
       this.saldo = 0;
    }

    public boolean sacar( double valor ){
        if ( valor > this.getLimite() )
            return false;
        else if ( valor > this.getSaldo() )
            return false;
        else {
            this.setSaldo( this.getSaldo() - valor );
            return true;
        }

    }

    public boolean depositar(double valor){
        this.saldo += valor;
        return true;
    }

    public String imprimirSaldo(){
        return String.valueOf(this.getSaldo());
    }


    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


}
