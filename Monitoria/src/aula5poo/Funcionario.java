package aula5poo;

public abstract class Funcionario {
	private String nome;
	private Double salarioBase;
	
	protected Funcionario() {
		
	}
	
	protected Funcionario(String nome) {
		this.nome = nome;
	}
	protected Funcionario(String nome, Double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
	
	public String getNome(){
		return nome;
	}
	public void setNome() {
		this.nome = nome;
	}
	
	
	protected double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(Double salarioBase) {
		if(salarioBase<0) {
			System.out.println("Valor invalido, settando para 0");
			this.salarioBase = 0.0;
		}
			
			this.salarioBase = salarioBase;
		
	}
	
	
	public void baterPonto() {
		System.out.println("Ponto Batido");
	}
	
	public abstract double calcularSalario();
	
	
}
