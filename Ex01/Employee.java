
public class Employee {
	String nome;
	double salario;
	double imposto;
	
	public double NetSalary() {
		return salario - imposto;
	}
	
	public void Increase(double percent) {
		salario += salario * percent/100 ;
	}
}
