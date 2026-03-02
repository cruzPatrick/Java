package aula5poo;

public class Airport {

	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Airport() {
		
	}
	
	public Airport(String nome) {
		this.nome = nome;
	}
	
	public static void main(String[] args) {
		Airport metropolisAirport = new Airport();
		Helicopter copter = new Helicopter();
		SeaPlane splane = new SeaPlane();
		
		metropolisAirport.givePermissionToLand(copter);
		metropolisAirport.givePermissionToLand(splane);
		
		Airport g = new Airport("Galeão");
		g.givePermissionToLand(copter);
		
	}
	
	private void givePermissionToLand(Flyer f) {
		if(getNome() == null) 
			System.out.println("Aeroporto [ Sem nome ] vai dar permissão para pouso");
		else
			System.out.println("Aeroporto [" + getNome() + "] vai dar permissão para pouso");
		
		f.land();
		System.out.println(f.getClass().getSimpleName() + " pousando (já está feito)");
	}
	

}
