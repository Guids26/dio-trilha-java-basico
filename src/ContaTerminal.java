import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, criar a conta digite as seguintes informações...");
		System.out.print("N. da Agência com digito: ");
		String agencia = scanner.nextLine();
		System.out.print("N. da conta: ");
		int conta = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nome do titular: " );
		String nome = scanner.nextLine();
		double saldo = 237.48;
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + agencia +", conta " + conta +" e seu saldo "+ saldo +" já está disponível para saque!");

	}
}
