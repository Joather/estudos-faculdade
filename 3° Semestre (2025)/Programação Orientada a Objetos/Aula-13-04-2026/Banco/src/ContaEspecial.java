public class ContaEspecial extends Conta {
    
    public ContaEspecial(int codigoCliente, int numeroConta, 
                         double saldo) {
        super(codigoCliente, numeroConta, saldo);
    }

    public void saque(double valor) {
        double chequeEspecial = 5000;
        if (valor <= (saldo + chequeEspecial)) {
            saldo = saldo - valor;
        }
    }
}
