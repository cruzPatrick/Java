public class Funcionario1 {
	public Double salario;
	public Double bonus;
	
	public Funcionario1(Double salario, Double bonus) {
		this.bonus = bonus;
		this.salario = salario;
	}
	
	public void calcularBonus() {
		System.out.println("Salario total = " + salario);
	}
}
