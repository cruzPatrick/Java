package polimorf;
public class Aluno extends Pessoa{
	public int id;
	
	public Aluno(String nome, int idade, int id) {
		super(nome, idade);
		this.id = id;
	}
	
	public Aluno() {
		super();
		this.id = 0;
	}
	
	@Override
	public void Apresentar() {
		System.out.println("Eu sou um Aluno");
	}
	
}
