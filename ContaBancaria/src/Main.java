public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ContaCorrente c1 = new ContaCorrente();
        c1.depositar(100);
        c1.sacar(50);

        System.out.println(c1.getSaldo());

        ContaPoupanca c2 = new ContaPoupanca();
        c2.depositar(100);

        ContaPoupanca c3 = new ContaPoupanca();
        c3.depositar(300);

        c3.transferir(150, c2);

        System.out.println(c2.getSaldo());
    }
}