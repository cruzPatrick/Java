package aula5poo;

public class Principal {
	public static void main(String []args) {
		Airplane[] air = retornaAleatorio();
		for(int i = 0; i < air.length; i++) 
			decolar(air[i]);//daria pra ser um for(Airplane x: air)
		
		
	}
	
	public static Airplane [] retornaAleatorio() {
		int tam = (int)(Math.random() * 101);

		Airplane [] air = new Airplane[tam];
		
		for(int i = 0; i < tam; i++) {
			if(ale()%2 != 0) {
				air[i] = new Helicopter();
			}
			else
				air[i] = new SeaPlane();
		}
		return air;
		
	}
	
	public static int ale() {	
		return (int) (Math.random()*1000);
	}
	
	public static void decolar(Airplane fly) {
		
		switch(fly) {
			case Helicopter h ->h.ligarHelice();
			case SeaPlane h -> h.ligarTurbinas(); // ideal é colocar letras diferentes, está certo, mas a boa prática pede isso
			case null -> {return;}
			default -> System.out.println("Nave desconhecida");
		}
		fly.takeOff();		
		/*		  
		if(fly instanceof Helicopter) {
			((Helicopter) fly).ligarHelice();
			fly.fly();
		}
		else {
			((SeaPlane) fly).ligarTurbinas();
			fly.fly();
		}		  
		 */
	}
}
