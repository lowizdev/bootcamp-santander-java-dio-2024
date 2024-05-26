import java.util.Scanner;

public class ContaTerminal {

    public Conta cadastraNovaConta(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo !");
        double saldo = scanner.nextDouble();

        Conta conta = new Conta(numero, agencia, nome, saldo);

        System.out.println(conta.montaMensagemBoasVindas());

        return conta;
    }

    public class Conta{
        private int numero;
        private String agencia;

        private String nomeCliente;

        private double saldo;

        public Conta(int numero, String agencia, String nomeCliente, double saldo) {
            this.numero = numero;
            this.agencia = agencia;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
        }

        public String montaMensagemBoasVindas (){
            return "Olá "+this.nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+this.agencia+", conta "+this.numero+" e seu saldo "+this.saldo+" já está disponível para saque";
        }
    }


}


