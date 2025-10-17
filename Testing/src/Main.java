import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o número da conta: ");
		int numeroConta = sc.nextInt();
		
		
		sc.nextLine();
		
		System.out.println("Insira o titular da conta: ");
		String titular = sc.nextLine();

		
		System.out.println("Existe um depósito inicial (s/n)? ");
		String confirm = sc.nextLine();	

		
		Conta conta;
		if(confirm.equalsIgnoreCase("s")) {
			System.out.println("Insira o valor do depósito inicial: ");
			double valor = sc.nextDouble();
			conta = new Conta(numeroConta, titular, valor);
		}
		else
			conta = new Conta(numeroConta, titular);
		System.out.println(conta);
		
		System.out.println("Insira o valor do deposito: ");
		double val = sc.nextDouble();
		conta.deposito(val);
		System.out.println(conta);
		
		System.out.println("Insira o valor do saque: ");
		val = sc.nextDouble();
		conta.saque(val);
		System.out.println(conta);
		
		sc.close();
	}

}
