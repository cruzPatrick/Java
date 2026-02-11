package aula4POO;


public class HerancaArrays {
	
	public static void testarSom(Animal2 e) {
		e.emitirSom();
	}
	
	public static void facaAlgo (Animal2 e) {
		if (e instanceof Cobra2) 
			System.out.println("Eu sou uma cobra");
		else 
			System.out.println("Eu sou outro tipo de animal");
	}
	public static void facaAlgo1(Animal2 e) {
		if(e instanceof Gato2) {
			//e.ronronar(); não funcionar porque ele é um animal e não um gato completo, ronronar é exclusivo da classe filha e não da classe pai, se fosse emitir som até iria, pois tem override
			Gato2 e2 = (Gato2)e;
			e2.ronronar();
		}
		else
			System.out.println("Nada...");
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
		
		System.out.println("----------( 会いたくて - アド )--------------");
		
		Gato2 a = new Gato2();
		Animal2 b = new Cobra2();
		Animal2 c = new Gato2();
		
		testarSom(a);
		testarSom(b);
		testarSom(c);
		
		
		System.out.println("----------( うっせえわ - アド )--------------");
		//usando instaceof para ver como se porta com polimorfismo
		facaAlgo(a);
		facaAlgo(b);
		
		System.out.println("----------( 罪と罰 歌いました - アド )--------------");
		
		facaAlgo1(a);
		facaAlgo1(b);
		facaAlgo1(c);
		
		System.out.println("----------( Преступление и наказание - Фёдор Миха́йлович Достое́вский)--------------");
		
		
	}

	
}
