package upcasting;

public class Cachorro extends Animal{
	
	public Cachorro() {
		super();
	}
	public Cachorro(String tipo, Integer idade) {
		super(tipo, idade);
	}
	
	@Override
	public void barulho() {
		System.out.println("AU AU");
	}
	
	public void abanarRabo() {
		System.out.println("Snip Snip");
	}
}
