package polimorf;
public class Funcionario extends Pessoa{
	public Double salario;
	
	public Funcionario() {
		super();
		this.salario = 0.0;
	}
	
	public Funcionario(String nome, int idade, double salario) {
		super(nome, idade);
		this.salario = salario;
	}
	
	@Override
	public void Apresentar() {
		System.out.println("Eu sou um Funcionario");
	}
}
