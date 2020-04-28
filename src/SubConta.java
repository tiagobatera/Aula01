public class SubConta {

    private int numeroSubConta;
    private int numeroContaRaiz;
    private int gerencia;
    private String nome;
    private double saldo;


    public int getNumeroSubConta() {
        return numeroSubConta;
    }

    public void setNumeroSubConta(int numeroSubConta) {
        this.numeroSubConta = numeroSubConta;
    }

    public int getNumeroContaRaiz() {
        return numeroContaRaiz;
    }

    public void setNumeroContaRaiz(int numeroContaRaiz) {
        this.numeroContaRaiz = numeroContaRaiz;
    }

    public int getGerencia() {
        return gerencia;
    }

    public void setGerencia(int gerencia) {
        this.gerencia = gerencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String impressaoSubConta(){
        return " Nome: " + nome + "\n Saldo: " + saldo + "\n Gerente: " + gerencia +
               "\n Numero Conta Raiz: " + numeroContaRaiz + "\n Numero Sub Conta: " + numeroSubConta;
    }
}
