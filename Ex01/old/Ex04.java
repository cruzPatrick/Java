import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas
		// trabalhadas, o valor que recebe por hora e calcula o salário desse
		// funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		// casas decimais.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o numero do funcionario: ");
		int id = sc.nextInt();
		System.out.println("Quantas horas trabalhadas: ");
		double hour = sc.nextDouble();
		System.out.println("Qual o salário: ");
		double val = sc.nextDouble();
		
		System.out.println("NÚMERO = " + id + "\nSalário = " + (hour*val));
	}

}
