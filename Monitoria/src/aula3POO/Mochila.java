package aula3POO;

public class Mochila {
	private String cor;
	private Integer anoFabricacao;
	
	public Mochila() {
		this.cor = null;
		this.anoFabricacao = null;
	}
	
	public Mochila(String cor, Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
}
