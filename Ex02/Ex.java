import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o Número da conta: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("Insira o titular da conta: ");
		String nome = sc.nextLine();
		System.out.println("Existe um depósito inicial (s/n)? ");
		String confirm = sc.nextLine();
		Conta conta;
		if(confirm.equalsIgnoreCase("s")) {
			System.out.println("Insira o valor do depósito inicial: ");
			double val = sc.nextDouble();
			conta = new Conta(num, nome, val);
		}
		else 
			conta = new Conta(num, nome);
		System.out.println("Dados da conta\nConta " + conta.getNumConta() + ", Titular: " + conta.getNome() + ", Balanço: " + conta.getVal());
		
		System.out.println("Insira o valor do depósito: ");
		double val = sc.nextDouble();
		conta.depos(val);
		System.out.println("Dados da conta\nConta " + conta.getNumConta() + ", Titular: " + conta.getNome() + ", Balanço: " + conta.getVal());
		
		System.out.println("Insira o valor do saque: ");
		val = sc.nextDouble();
		conta.saque(val);
		System.out.println("Dados da conta\nConta " + conta.getNumConta() + ", Titular: " + conta.getNome() + ", Balanço: " + conta.getVal());
		
		sc.close();
	}

}
