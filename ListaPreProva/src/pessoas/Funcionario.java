package pessoas;

public class Funcionario extends Pessoa1{
	public Funcionario(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void apresentar() {
		System.out.println("Sou funcionario");
	}
}
