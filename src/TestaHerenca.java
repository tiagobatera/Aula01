public class TestaHerenca {

    public static void main(String[] args){

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.getTipoConta();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.getTipoConta();

        System.out.println(contaPoupanca.verificaTipoDaConta());

        contaCorrente.setSaldo(100);





        }




}
