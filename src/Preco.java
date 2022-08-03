import java.util.Scanner;
public class Preco {

	public static void main(String[] args) {
		System.out.println("Escolha um item: ");
		System.out.println("1 - Pastel de Carne ");
		System.out.println("2 - Pastel de Queijo ");
		System.out.println("3 - Pastel de Pizza ");
		System.out.println("4 - X-Bacon");
		System.out.println("5 - Coca-Cola");
		
		int codigo;
		int quantidade;
		
		double total;
		
		Scanner sc = new Scanner(System.in);
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 7;
		}
		else if (codigo == 2){
			total = quantidade * 8;
		}
		else if (codigo == 3) {
			total = quantidade * 6;
		}
		else if (codigo == 4) {
			total = quantidade * 12;
		}
		else {
			total = quantidade * 5;
		}
		
		System.out.printf("o valor é: %.2f%n", total );
		
		
		sc.close();
		

	}

}
