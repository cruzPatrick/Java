public class ConversaoExplicita {
	public static void main(String[] args) {
		double md = 7.5;
		int parteInteira = (int)md;
		float acrescimo = 1.75f;
		System.out.println(md + parteInteira + acrescimo);
		char letra = (char)74;
		System.out.println(letra);
		int num = (int)letra;
		System.out.println(num);

	}
}

/*

saída tinha que ser:
16.25
J
74

Antes da modificações:
public class ConversaoExplicita {
    public static void main(String[] args) {
        double md = 7.5;
        int parteInteira = md;
        float acrescimo = 1.75;
        System.out.println(md + parteInteira + acrescimo);
        char letra = 74;
        System.out.println(letra);
        int num = (int)letra;
        System.out.println((char)num);
    }
}

*/

/*
TL;DR
Se tem de qualquer um para char eu PRECISO fazer casting explicito

Se tem float com . eu PRECISO colocar f (exemplo do exercicio é 1.75f, só 1.75 não rola)

De char para qualquer um maior que ele eu não preciso converter, então no num é só apagar

Sempre é necessário do maior para o menor
*/