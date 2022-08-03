import java.util.Scanner;
public class MenorNumero {

	public static void main(String[] args) {
		System.out.println("Digite os numero");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < c) {
			System.out.println("O menor numero é: "+ a);
		}
		else if (b < a && b < c) {
			System.out.println("O menor numero é: "+ b);
		}
		else {
			System.out.println("O menor numero é: "+ c);
		}
		
		sc.close();

	}

}
