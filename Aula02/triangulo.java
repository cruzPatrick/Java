package aula02;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o tamanho do 1º lado do triangulo? ");
		double l1 = sc.nextDouble();
		System.out.println("Qual o tamanho do 2º lado do triangulo? ");
		double l2 = sc.nextDouble();
		System.out.println("Qual o tamanho do 3º lado do triangulo? ");
		double l3 = sc.nextDouble();
		
		
		if(l1 + l2 <=l3 || l2 + l3 <= l1 || l1 + l3 <= l2) {
			System.out.println("Não os lados informados não formam um triângulo");
			sc.close();
			return;
		}
		
		if(l1 == l2 && l2==l3) {
			System.out.println("O triângulo é equilátero");
			sc.close();
			return;
		}
		if(l1 == l2 || l1 == l3 || l2 == l3) 
			System.out.println("O triângulo é isosceles");
		else
			System.out.println("triângulo é escaleno");
		
		sc.close();
	}
	
	/*
	 Daria para fazer por operador ternário, ficaria assim:
	 String tipo =
	 			(l1 == l2 && l2 == l3)? "Equilátero";
	 			(l1 == l2 || l1 == l3 || l2 == l3)? "Isosceles";
	 			"Escaleno";
	  
	  
	  
	  
	  
	  
	 */

}
