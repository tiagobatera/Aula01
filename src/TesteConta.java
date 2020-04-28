public class TesteConta {

    public static void main(String[] args) {
        SubConta subConta = new SubConta();
        subConta.setNome("Fulano");
        subConta.setSaldo(100);
        subConta.setNumeroSubConta(112233);
        subConta.setNumeroContaRaiz(1234567);
        subConta.setGerencia(001);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeTitular("Tiago");
        contaPoupanca.setNumeroConta(1234567);
        contaPoupanca.setAgencia("1234");
        contaPoupanca.setSaldo(1000);
        contaPoupanca.setDataAbertura("24/04/2020");
        contaPoupanca.setSubConta(subConta);

        System.out.print("Conta: " + contaPoupanca.getNomeTitular() + ("\n"));
        double sacaValor = contaPoupanca.recebeRetira();
        System.out.println("O valor do saldo " + contaPoupanca.getNomeTitular() + " após saque é: \n" + sacaValor);
        //Metodo Receber
        double valorRecebe = contaPoupanca.recebeValor();
        System.out.println("O valor " + contaPoupanca.getNomeTitular() + " após o deposito é: \n " + valorRecebe);
        //Metodo Rendimento
        double rendimentoCalcula = contaPoupanca.calculaRendimento();
        System.out.println("O valor do saldo " + contaPoupanca.getNomeTitular() + " após rendimento é: \n " + rendimentoCalcula);

        //recuperaDadosClienteparaImpressao
        System.out.println("Seus dados da conta é \n " + contaPoupanca.recuperaDadosImpressao());
        System.out.println("Os dados do  cliente da subconta: \n" + contaPoupanca.getSubConta().impressaoSubConta());
        System.out.println("Posição de memoria da conta é: \n" + contaPoupanca + "\n E da subconta é: \n" + subConta +("\n\n"));
        System.out.println("\n\n O rendimento da Conta Poupança é: \n" + contaPoupanca.calculaRendimentoMensal() + "\n\n" );


        SubConta subConta2 = new SubConta();
        subConta2.setNome("Fulano");
        subConta2.setSaldo(100);
        subConta2.setNumeroSubConta(445566);
        subConta2.setNumeroContaRaiz(7654321);
        subConta2.setGerencia(002);

        ContaPoupanca contaPoupanca2 = new ContaPoupanca();
        contaPoupanca2.setNomeTitular("Pedro");
        contaPoupanca2.setNumeroConta(7654321);
        contaPoupanca2.setAgencia("4321");
        contaPoupanca2.setSaldo(2000);
        contaPoupanca2.setDataAbertura("24/04/2020");
        contaPoupanca2.setSubConta(subConta);

        System.out.print("Conta: " + contaPoupanca2.getNomeTitular() + ("\n"));
        double sacaValor2 = contaPoupanca2.recebeRetira();
        System.out.println("O valo do saldo " + contaPoupanca2.getNomeTitular() + " após o saque é \n " + sacaValor2);
        //Metodo Receber
        double valorRecebe2 = contaPoupanca2.recebeValor();
        System.out.println("O valor " + contaPoupanca2.getNomeTitular() + " após deposito é \n" + valorRecebe2);
        //Metodo Rendimento
        double rendimentoCalcula2 = contaPoupanca2.calculaRendimento();
        System.out.println("O valor do saldo " + contaPoupanca2.getNomeTitular() + " após rendimento é \n" + rendimentoCalcula2);

        System.out.println("Seus dados da conta é \n" + contaPoupanca2.recuperaDadosImpressao());
        System.out.println("Os dados do  cliente da subconta: \n" + contaPoupanca2.getSubConta().impressaoSubConta());
        System.out.println("Posição de memoria da conta é: \n" + contaPoupanca2 + "\n E da subconta é: \n" + subConta2 + ("\n"));
        System.out.println("\n\n O rendimento da Conta Poupança é: \n" + contaPoupanca2.calculaRendimentoMensal() + "\n\n");

        if (contaPoupanca.getNumeroConta() == contaPoupanca2.getNumeroConta()) {
            System.out.println("\n Os Dados do cliente: \n" + contaPoupanca.getNomeTitular() + " e " + contaPoupanca2.getNomeTitular() + " são IGUAIS");
        }else{
            System.out.println("\n Os Dados do cliente: \n" + contaPoupanca.getNomeTitular() + " e " + contaPoupanca2.getNomeTitular() + " são DIFERENTES");
        }

    }


}



