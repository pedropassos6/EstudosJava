import java.util.Scanner;
public class ContaTelefone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os minutos: ");
		
		int minutos = sc.nextInt();
		double conta = 50.00;
		
		if (minutos <= 100) {
			System.out.printf("o valor da conta é: %.2f%n" ,conta);
		}
		else {
			conta = conta + (minutos - 100) *2;
		}
		System.out.printf("o valor da conta é: %.2f%n", conta);
		
		sc.close();

	}

}
