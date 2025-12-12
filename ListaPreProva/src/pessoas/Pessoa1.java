package pessoas;

public class Pessoa1 {
	private String nome;
	public int idade;

	public Pessoa1(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa1() {
		this.nome = "Não informado";
		this.idade = 0;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void mostrarDados() {
		System.out.println("Nome: "+ nome + "\nIdade: " + idade);
	}
	public void apresentar() {
		System.out.println("Som generico");
	}
}
