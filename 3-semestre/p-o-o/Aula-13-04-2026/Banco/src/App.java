public class App {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new Conta(1, 23, 
                            1500);
        System.out.println("Saldo da conta " + conta1.getNumeroConta()
                    + ": R$ " + conta1.getSaldo());
        conta1.deposito(500);
        conta1.deposito(200);
        getSaldo(conta1);
        conta1.saque(450);
        getSaldo(conta1);

        ContaPoupanca conta2 = new ContaPoupanca(2, 
                                45, 1500);
        conta2.deposito(300);
        getSaldo(conta2);
        conta2.calcularRendimentoMensal(5);
        getSaldo(conta2);

        ContaEspecial conta3 = new ContaEspecial(3, 
                                57, 1500);
        conta1.saque(4000);
        getSaldo(conta1);
        conta2.saque(4000);
        getSaldo(conta2);
        conta3.saque(4000);
        getSaldo(conta3);
                       
    }

    public static void getSaldo(Conta conta) {
        System.out.println("Saldo da conta " + conta.getNumeroConta()
                    + ": R$ " + conta.getSaldo());        
    }

    public static void getSaldo(ContaPoupanca conta) {
        System.out.println("Saldo da conta " + conta.getNumeroConta()
                    + ": R$ " + conta.getSaldo());        
    }

    public static void getSaldo(ContaEspecial conta) {
        System.out.println("Saldo da conta " + conta.getNumeroConta()
                    + ": R$ " + conta.getSaldo());        
    }
    

}
