package upcasting;
//Não pede mas quero criar para testar algumas coisas :p
public class Aluno {
	public String nome;
	public Integer idade;
	public Double tamanho, n1, n2;
	
	public Aluno() {
		this.nome = null;
		this.idade = null;
		this.n1 = null;
		this.n2 = null;
		this.tamanho = null;
	}
	public Aluno(String nome, Integer idade, Double tamanho, Double n1, Double n2) {
		this.nome = nome;
		this.idade = idade;
		this.n1 = n1;
		this.n2 = n2;
		this.tamanho = tamanho;
	}
	
	public double nota() {
		return (n1+n2)/2;
	}
}
