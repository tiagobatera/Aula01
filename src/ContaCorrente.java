public class ContaCorrente extends Conta {

    private String dataDaTransferencia;

    ContaCorrente(){
        super.setTipoConta("Conta Corrente");
    }


    public double transfereDinheiroParaOutraConta(){
        double transfere;
        transfere = super.getSaldo() - 30;
        return transfere;


    }


}
