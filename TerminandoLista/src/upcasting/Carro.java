package upcasting;

public class Carro extends Veiculo{
	private String modelo;
	
	public Carro() {
		super();
		this.modelo = null;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
