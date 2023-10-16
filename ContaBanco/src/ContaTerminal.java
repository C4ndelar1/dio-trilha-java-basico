import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá ".concat(nomeCliente) + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é ".concat(agencia) + " e conta " + numero + ". Seu saldo de " + saldo + " já está disponível para saque.");

    }
}