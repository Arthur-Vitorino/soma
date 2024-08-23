import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite outro número: ");
        int y = scanner.nextInt();
        
        int soma = x + y;
        System.out.println("Valor da soma de X e Y: "+soma );

        scanner.close();
	}

}
