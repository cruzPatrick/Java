package pessoas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa1[] pessoa = new Pessoa1[3];
		
		pessoa[0] = new Aluno("Joao", 10);
		pessoa[1] = new Professor("Marcos", 20);
		pessoa[2] = new Funcionario("Junior", 30);
		
		for(Pessoa1 p : pessoa) {
			p.apresentar();
		}
	}

}
