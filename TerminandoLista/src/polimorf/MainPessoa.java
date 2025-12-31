package polimorf;

import java.util.Scanner;

public class MainPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa[] escola = new Pessoa[3];
		
		escola[0] = new Professor();
		escola[1] = new Aluno();
		escola[2] = new Funcionario();
		
		for(Pessoa obj: escola) {
			obj.Apresentar();
		}
	}

}
