package pessoas;

public class Professor extends Pessoa1{
	public Professor(String nome, int idade) {
		super(nome,idade);
	}
	
	@Override
	public void apresentar() {
		System.out.println("Sou professor");
	}
}
