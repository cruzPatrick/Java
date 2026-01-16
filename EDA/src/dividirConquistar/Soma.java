package dividirConquistar;

public class Soma {
	public static void main(String[] Args) {
		int[] num = {1,2};
		System.out.println(soma(num, num.length-1));
	}
	public static int soma(int[] n1, int indice) {
		if(indice == 0) 
			return n1[0];
		else {
			return n1[indice] + soma(n1, indice-1);
		}
	}
}
//vou fazer uma versão que pede pro usuário o tamanho da soma pra deixar mais dinâmico
/*
	Scanner sc = new Scanner(System.in);
	System.out.println("Escreva a quantidade de números que você quer somar");
	int valor = sc.nextInt();	
	int[] num = new int[valor];
	
	for(int i = 0; i<num.length; i++){
		System.out.println("Qual é o " + (i+1) + " valor");
		num[i] = sc.nextInt();
	}
	
	
	System.out.println(soma(num, num.length-1));
 
 
 
 
 
 
 
 
 
*/