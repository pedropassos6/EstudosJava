import java.util.Locale;



public class Main {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Mesa de Escritorio";
		
		double preco1 = 2100.00;
		double preco2 = 650.0;
		double measure = 53.234567;
		
		int age = 30;
		int code = 5290;
		char genero = 'F';
		
		System.out.println("Produtos");
		System.out.printf(produto1 +" Tem preco de $ %.2f%n", preco1);
		System.out.printf("%s Tem preco de $ %.2f%n", produto2, preco2);
		System.out.println(age+ " Anos de idade, codigo " +code+ ", do genero "+genero);
		System.out.printf("Medida com 8 casas decimais %.8f%n", measure);
		System.out.printf("Arredondando com 3 casas decimais %.3f%n", measure);
		Locale.setDefault(Locale.US); 
		System.out.printf("Ponto decimal americano %.3f%n", measure);

	}

}