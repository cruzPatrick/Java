package aula5poo;

public class Vendedor extends Funcionario{
	private Double comissao;
	
	public Vendedor(String nome, Double salarioBase, Double comissao) {
		super(nome, salarioBase);
		this.comissao = comissao;
	}
	
	public Vendedor(String nome, Double salarioBase) {
		this(nome, salarioBase, 0.0);
	}
	public Double getComissao() {
		return comissao;
	}
	
	public void setComissao() {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		Double salario = getSalarioBase();
		return salario + comissao;
	}
	
}
