import java.util.Scanner;
public class DivisaoOpcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisao nao possivel");
			}else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		sc.close();

	}

}
