import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Maria");
		lista.add("João");
		lista.add("Bob");
		lista.add("Anna");
		lista.add(2, "Marco");
		
		System.out.println(lista.size());
		for(String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		
		System.out.println(lista.indexOf("Maria"));
		
		System.out.println("------------------------");
		
		lista.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x: lista) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		
		System.out.println("Index do Bob " + lista.indexOf("Bob"));
		System.out.println("Index do Marco " + lista.indexOf("Marco"));
		System.out.println("------------------------");
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------");
		String nome = lista.stream().filter(x-> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);

	}

}
