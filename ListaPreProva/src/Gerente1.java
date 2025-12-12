public class Gerente1 extends Funcionario1 {
	public Gerente1(Double salario, Double bonus) {
		super(salario, bonus);
	}
	
	@Override
	public void calcularBonus() {
		System.out.println("Salario total = " + (salario + bonus));
	}
}
