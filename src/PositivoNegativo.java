import java.util.Scanner;
public class PositivoNegativo {

	public static void main(String[] args) {
		System.out.println("Digite um número ");
		Scanner sc = new Scanner(System.in);
		double numero;
		numero = sc.nextDouble();
		if (numero >=0) {
			System.out.println("O número é Positivo ");
		}
		else {
			System.out.println("O número é Negativo ");
		}
		
		sc.close();

	}

}
