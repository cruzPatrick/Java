package pessoas;

public class Aluno extends Pessoa1{
	public Aluno(String nome, int idade) {
		super(nome, idade);
	}

	
	@Override
	public void apresentar() {
		System.out.println("Sou aluno!");
	}
}
