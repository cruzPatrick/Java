package aula5poo;

import java.util.Scanner;

public class MainFGV2 {
	public static void main(String[] args) {
		//Funcionario f = new Funcionario(); isso da problema pq é abstrata
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos Funcionario são? ");
		int tot = sc.nextInt();
		
		Funcionario[] f = new Funcionario[tot]; 
		
		for(int i = 0; i <f.length; i++) {
			System.out.printf("Ele é Gerente ou vendedor? \n(0 para gerente e 1 para vendedor)");
			int op = sc.nextInt();
			while(op < 0 || op > 1) {
				System.out.printf("Escreva um valor válido");
				op = sc.nextInt();
			}
			sc.nextLine();
			if(op == 0) {
				System.out.printf("Escreva seu nome:");
				String nome = sc.nextLine();
				System.out.printf("Escreva seu salario: ");
				double sal = sc.nextDouble();
				while(sal <= 0) {
					System.out.printf("Salario invalido, escreva um novo valor: ");
					sal = sc.nextDouble();
				}
				sc.nextLine();
				f[i] = new Gerente(nome,sal);
			}
			else {
				System.out.printf("Escreva seu nome:");
				String nome = sc.nextLine();
				System.out.printf("Escreva seu salario: ");
				double sal = sc.nextDouble();
				while(sal <= 0) {
					System.out.printf("Salario invalido, escreva um novo valor: ");
					sal = sc.nextDouble();
				}
				sc.nextLine();
				System.out.printf("Escreva sua comissao: ");
				double comi = sc.nextDouble();
				sc.nextLine();
				f[i] = new Vendedor(nome,sal,comi);
			}
		}
		
		for(Funcionario x:f) {
			if(x != null) {
				System.out.println("Ele é: " + x.getClass().getSimpleName());
				x.baterPonto();
				System.out.println(x.calcularSalario());
				
			}
		}
		
		
		sc.close();
	}
	
}
