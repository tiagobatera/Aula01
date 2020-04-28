public class Conta {

    private String nomeTitular;
    private int numeroConta;
    private String agencia;
    private double saldo;
    private String dataAbertura;
    private double saca = 500;
    private double deposita = 100;
    private SubConta subConta;
    private String tipoConta;

    //getters e setters
    public String getNomeTitular(){
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    public int getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public String getAgencia(){
        return agencia;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public String getDataAbertura(){
        return dataAbertura;
    }
    public void setDataAbertura(String dataAbertura){
        this.dataAbertura = dataAbertura;
    }

    public SubConta getSubConta(){
        return subConta;
    }
    public void setSubConta(SubConta subConta){
        this.subConta = subConta;

    }
    public String getTipoConta(){
        return tipoConta;
    }
    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }

    //Metodos
    public double recebeRetira() {
        saldo = saldo - saca;
        return saldo;
    }

    public double recebeValor() {
        saldo = saldo + deposita;
        return saldo;
    }

    public double calculaRendimento() {
        saldo = saldo + (saldo * 0.1);
        return saldo;

    }
    public String recuperaDadosImpressao() {
        return "Nome Titular: " + nomeTitular + "\n Numero Conta: " + numeroConta +
               "\n Agencia: " + agencia + "\n Saldo: " + saldo + "\n Data Abertura: " + dataAbertura;

    }

    public String verificaTipoDaConta(){
        if (tipoConta == "Conta Corrente"){
            return "Conta Corrente";
        }else{
            return "Conta Poupança";
        }
    }
}



