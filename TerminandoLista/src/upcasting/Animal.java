package upcasting;

public class Animal {
	public String tipo;
	public Integer idade;
	
	public Animal() {
		this.tipo = "";
		this.idade = 0;
	}
	public Animal(String tipo, Integer idade) {
		this.tipo = tipo;
		this.idade = idade;
	}
	
	public void barulho() {
		System.out.println("Som generico");
	}
	public String tipos() {
		return "Animal";
	}
}
