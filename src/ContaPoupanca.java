public class ContaPoupanca extends Conta{

    private double rendimentoMensal = 0.04;
    ContaCorrente contaCorrente = new ContaCorrente();
     ContaPoupanca(){
         super.setTipoConta("Conta Poupança");
         System.out.println("O saldo transferido é: " + contaCorrente.transfereDinheiroParaOutraConta());
     }

    public double calculaRendimentoMensal(){
        double rendimento;
        rendimento = super.getSaldo() * rendimentoMensal;
        return rendimento;

    }

}
