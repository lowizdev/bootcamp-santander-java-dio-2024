public interface Conta {


    boolean depositar(double valor);
    double sacar(double valor);

    boolean transferir(double valor, Conta contaDestino);

}
