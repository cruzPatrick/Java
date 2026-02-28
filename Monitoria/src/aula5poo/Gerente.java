package aula5poo;

public class Gerente extends Funcionario{
	
	
	public Gerente() {
		super();
	}
	
	public Gerente(String nome, Double salario) {
		super(nome, salario);
	}
	
	public double calcularSalario() {
		double salario = getSalarioBase();
		return salario*1.2;
	}
}
