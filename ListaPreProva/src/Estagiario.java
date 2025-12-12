
public class Estagiario extends Funcionario1{
	public Estagiario(Double salario, Double bonus) {
		super(salario,bonus);
	}
	
	@Override
	public void calcularBonus() {
		System.out.println("Salario total = " + (salario + (bonus*0.5)));
	}
}
