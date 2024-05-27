public class ContaCorrente implements Conta {

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double saldo;

    @Override
    public boolean depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositando em corrente");
        return true;
    }

    @Override
    public double sacar(double valor) {

        if(valor > this.saldo){
            return 0;
        }

        System.out.println("Sacando em corrente");
        this.saldo -= valor;

        return saldo;
    }

    @Override
    public boolean transferir(double valor, Conta contaDestino) {
        double valorDeposito = this.sacar(valor);

        if(valorDeposito > 0) {
            contaDestino.depositar(valorDeposito);

            return true;
        }

        return false;
    }
}
