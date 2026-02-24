package aula4POO;

public class TesteBanco {

	public static void main(String[] args) {
		Cliente c3 = new Cliente ("12312312312", "Artur");
		Conta c = new Conta (444, c3);
		
		System.out.println(c.getNumero());
		System.out.println(c.getSaldo());
		System.out.println(c.getTitular());
		System.out.println(c.getTitular().getCpf());
		System.out.println(c.getTitular().getNome());
		
		System.out.println("--------------------------");
		Cliente c4 = new ClientePF("12312312312", "Arthur");
		Conta c1 = new Conta(444, c4);
		
		System.out.println(c1.getNumero());
		System.out.println(c1.getSaldo());
		System.out.println(c1.getTitular());
		System.out.println(c1.getTitular().getCpf());
		System.out.println(c1.getTitular().getNome());
		
	}

}
