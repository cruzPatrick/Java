import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva o código e depois a quantidade: ");
        
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        
        double preco = 0.0;
        
        switch (codigo) {
            case 1:
                preco = 4.0;
                break;
            case 2:
                preco = 4.5;
                break;
            case 3:
                preco = 5.0;
                break;
            case 4:
                preco = 2.0;
                break;
            case 5:
                preco = 1.5;
                break;
            default:
                System.out.println("Código inválido!");
                sc.close();
                return;
        }
        
        double total = preco * quantidade;
        
        System.out.printf("Total: R$ %.2f%n", total);
        
        sc.close();
    }
}
