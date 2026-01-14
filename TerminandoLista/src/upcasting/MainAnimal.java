package upcasting;

public class MainAnimal {
	
		public static void main(String[] args) {
			Animal a = new Cachorro();
			Animal b = new Animal();
			
			
			//b.abanarRabo(); da erro
			((Cachorro)b).abanarRabo();
			
			
			
		}
}
