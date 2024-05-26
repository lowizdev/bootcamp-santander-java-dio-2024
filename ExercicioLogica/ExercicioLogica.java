import java.util.Scanner;

public class ExercicioLogica {


    public class Contador {

        public static class ParametrosInvalidosException extends  Exception{}
        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            }catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }

        }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if(parametroUm > parametroDois){
                throw new ParametrosInvalidosException();
            }

            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            int auxiliar = 0;
            for (int i = parametroUm; i < parametroDois; i++){

                auxiliar += 1;
                System.out.println("Imprimindo o número " + auxiliar);
                System.out.println(i);

            }
        }
    }
}
