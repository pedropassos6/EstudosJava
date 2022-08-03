import java.util.Scanner;
public class Imposto {

	public static void main(String[] args) {
		double salario;
		double imposto;
		System.out.println("Digite o valor do salario");
		Scanner sc = new Scanner (System.in);
		salario = sc.nextDouble();
		
		if (salario <= 2000) {
			System.out.println("o valor do salario é " +salario + ", Voce é isento de pagar imposto");
		}
		else if (salario <= 3000){
			imposto = (salario - 2000) * 0.08;
			System.out.printf("O valor do salario é de " +salario+ ", o valor do imposto é %.2f%n", imposto);
			
		}
		else if (salario <=4500) {
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
			System.out.printf("O valor do salario é " +salario+ ", o valor do imposto é %.2f%n", imposto);
		}
		else if (salario >4500) {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("O valor do salario é " +salario+ ", o valor do imposto é %.2f%n", imposto);
		}
		
		
		sc.close();

	}

}
