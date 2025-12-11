
public class ForEach {

	public static void main(String[] args) {
		String[] vector = new String[] {"Maria", "João"};
		
		for(int i = 0; i < vector.length;i++) {
			System.out.println(vector[i]);
		}
		for(String obj: vector) {
			System.out.println(obj);
		}
	}

}
