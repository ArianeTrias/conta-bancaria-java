public class ContaBancaria {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this. saldo = saldo;
    }


    public void exibirMensagem() {
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. %n", nomeCliente);
    System.out.printf("Sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.%n",
     agencia, numero, saldo);
    }
}
