import java.util.Scanner;
public class ConversorGraus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double celsius;
		double fah;
		
		System.out.println("Digite a temperatura em celsius: ");
		celsius = sc.nextDouble();
		fah = (celsius * 9/5) + 32;
		
		System.out.printf("O valor em Fahrenheit é: %.1f", fah);

		//(°C × 9/5) + 32; formula de conversao
		
		sc.close();
	}

}
