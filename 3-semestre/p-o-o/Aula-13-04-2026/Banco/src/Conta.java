public class Conta {
    
    protected double saldo;
    protected int numeroConta;
    protected int codigoCliente;

    public Conta(int codigoCliente, int numeroConta, double saldo) {
        this.codigoCliente = codigoCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    public void saque(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        }
    }
    
}
