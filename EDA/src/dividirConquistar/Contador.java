package dividirConquistar;

import java.util.ArrayList;
import java.util.List;

public class Contador {

	public static void main(String[] args) {
		//Criação da Lista
		List <Integer> num = new ArrayList<>();
		
		
		//adicionar valores
		num.add(1);
		num.add(2);
		num.add(3);
		
		int primeiro = num.get(0);
		
		System.out.println(contar(num, num.size()));

	}
	public static int contar(List<Integer> lista, int indice) {
		if(indice == 0) //lista.isEmpty()
			return 0;
		else {
			return 1 + contar(lista, indice-1); // return 1 + contar (lista.subList(1, lista.size()));
		}
	}

}
