package aula4POO;


public class HerancaArrays {
	
	public static void testarSom(Animal2 e) {
		e.emitirSom();
	}
	
	public static void main(String[] args) {
/*
		Gato[] corrida1 = {new Gato(), new Gato(), new Gato()};
		Cobra[] corrida2 = {new Cobra(), new Cobra()};
		
		for(int i = 0; i < corrida1.length; i++) {
			corrida1[i].miar();
			corrida2[i].sibilar();
		}
		  
*/
		
		Animal2[] corrida = {new Gato2(), new Cobra2(), new Gato2(), new Cobra2(), new Gato2(), new Gato2()};
		
		for(int i = 0; i < corrida.length; i++) {
			corrida[i].emitirSom();
		}
		
		Animal2 m = new Gato2();
		
		System.out.println("----------(会いたくて - アド)--------------");
		
		Gato2 a = new Gato2();
		Animal2 b = new Cobra2();
		Animal2 c = new Gato2();
		
		testarSom(a);
		testarSom(b);
		testarSom(c);
		

	}

}
