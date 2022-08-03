import java.util.Locale;
import java.util.Scanner;

public class Entradas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*String x;
		x = sc.next();
		System.out.println("voce digitou " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("voce digitou " + y); 
		
		double r;
		r = sc.nextDouble();
		System.out.printf("voce digitou %.2f%n ", r);
		
		char t;
		t = sc.next().charAt(0);
		System.out.println("voce digitou " + t);*/
		
		String u;
		int g;
		double o;
		
		u = sc.next();
		g = sc.nextInt();
		o = sc.nextDouble();
		
		System.out.println("Os dados digitados foram ");
		System.out.println(u);
		System.out.println(g);
		System.out.println(o);
		
		
		sc.close();

	}

}