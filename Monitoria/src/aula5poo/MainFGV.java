package aula5poo;

import java.util.Scanner;

public class MainFGV {
	public static void main(String[] args) {
		//Funcionario f = new Funcionario(); isso da problema pq é abstrata
		
		Funcionario f = new Gerente("Joao", -2.0); 
		Scanner sc = new Scanner(System.in);
		
		while(f.getSalarioBase() <=0) {
			System.out.println("Insira um valor válido");
			f.setSalarioBase(sc.nextDouble());
		}
		
		f.baterPonto();
		System.out.println(f.calcularSalario());
		
		sc.close();
	}
	
}
