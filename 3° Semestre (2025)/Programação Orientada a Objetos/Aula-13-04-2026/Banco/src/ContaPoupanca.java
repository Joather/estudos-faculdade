public class ContaPoupanca extends Conta {
  
    public ContaPoupanca(int codigoCliente, int numeroConta, 
                         double saldo) {
        super(codigoCliente, numeroConta, saldo);
    }

    public void calcularRendimentoMensal(double juros) {
        double indice = 1 + (juros / 100);
        saldo = saldo * indice;
    }
}
