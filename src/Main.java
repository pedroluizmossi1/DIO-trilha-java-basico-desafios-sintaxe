import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startScanner();
    }

    public static void startScanner() {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal(0, "", "", 0.0);
        System.out.println("Digite o número da conta:");
        conta.numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a agência da conta:");
        conta.agencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        conta.nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo da conta:");
        try {
            conta.saldo = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número válido.");
            scanner.close();
            return;
        }
        System.out.println("Olá, " + conta.nomeCliente + ", obrigado por abrir sua conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque");
        scanner.close();
    }
}