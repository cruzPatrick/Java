import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee empre = new Employee();
		
		System.out.println("Nome: ");
		empre.nome = sc.nextLine();
		
		System.out.println("Salário: ");
		empre.salario = sc.nextDouble();
		
		System.out.println("Imposto: ");
		empre.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + empre.nome + ", " + empre.NetSalary());
		
		System.out.println("Qual a porcentagem: ");
		double per = sc.nextDouble();
		
		empre.Increase(per);
		
		System.out.println("Dados atualizados: " + empre.nome + ", " + empre.NetSalary());
		
		sc.close();
	}

}
