import java.util.Scanner;
import java.util.Locale;
public class Construcao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		System.out.println("Digite a largura: ");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("O valor do terreno é: %.2f%n", preco);
		
		
		sc.close();

	}

}
