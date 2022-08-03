import java.util.Scanner;
public class MediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de medias que ira entrar: ");
		
		int n = sc.nextInt();
		
		System.out.println("Digite os valores: ");
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble(); 
		
			double media = (a * 2.0 + b * 3.0 + c * 5.0)/10;
		
			System.out.printf("A média ponderada é: %.1f%n", media);
		}
				
		sc.close();
		
	}

}
