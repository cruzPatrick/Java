package aula4POO;

public class ClientePF extends Cliente{
	public ClientePF() {
		
	}
	
	public ClientePF(String nome, String cpf, String profissao) {
		//super();
		super(nome, cpf, profissao);
	}
	
	public ClientePF(String nome, String cpf) {
		//super();
		this(nome,cpf,null);
	}
	@Override
	public String toString() {
		return "[Pessoa Física] " + super.toString();
	}
}
