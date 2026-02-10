package aula4POO;

public class Animal2 {
	private Integer idade;
	private String nome;
	
	public Animal2() {
		
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void emitirSom() {
		System.out.println("Som genérico");
	}
}
