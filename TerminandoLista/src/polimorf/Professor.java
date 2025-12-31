package polimorf;
public class Professor extends Pessoa{
	private String materia;
	
	public Professor(String nome, int idade, String materia) {
		super(nome, idade);
		this.materia = materia;
	}
	
	public Professor() {
		super();
		this.materia = "Vazio";
	}
	
	public String getMateria() {
		return this.materia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override
	public void Apresentar() {
		System.out.println("Eu sou Professor");
	}
}
