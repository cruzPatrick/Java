package polimorf;

import java.util.Scanner;

public class MainPagamento {

	public static void main(String[] args) {
		Pagamento[] pagamento = new Pagamento[3];
		Scanner sc = new Scanner(System.in);
		
		pagamento[0] = new PagamentoCartao();
		pagamento[1] = new PagamentoBoleto();
		pagamento[2] = new PagamentoPix();
		
		for(Pagamento obj: pagamento) {
			obj.pagar();
		}
		

		sc.close();
		
	}

}
