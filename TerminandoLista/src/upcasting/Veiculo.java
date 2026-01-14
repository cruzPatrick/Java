package upcasting;

public class Veiculo {
	private String dono;
	private Integer cpf;
	
	public Veiculo() {
		this.dono = null;
		this.cpf = null;
	}
	
	public Veiculo(String dono, Integer cpf) {
		this.cpf = cpf;
		this.dono = dono;
	}
	
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public Integer getCpf() {
		return cpf;
	}
	
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	
	public void barulho() {
		System.out.println("Barulho generico");
	}
}
