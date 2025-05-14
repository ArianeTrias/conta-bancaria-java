import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;



      try {
        while (true) {
            System.out.print("Digite o número da Conta: ");
            try {
                numero = Integer.parseInt(scanner.nextLine());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um número válido.");
                scanner.next();
            }
        }

        System.out.print("Por favor, digite o número da Agência: ");
         agencia = scanner.nextLine();

             

        System.out.print("Digite o nome do cliente:");
         nomeCliente = scanner.nextLine();

      
        while (true) {
        System.out.print("Digite o saldo:");
        try {
         saldo = Double.parseDouble(scanner.nextLine());
         break;
        } catch (NumberFormatException e) {
        System.out.println("Saldo inválido. Digite um número válido.");
    }
} 
    
        ContaBancaria conta = new ContaBancaria(numero, agencia, nomeCliente, saldo);
        conta.exibirMensagem();

 } catch (Exception e) {
        System.out.println("Erro inesperado: " + e.getMessage());
    } finally {

        scanner.close();
    }
  }
}