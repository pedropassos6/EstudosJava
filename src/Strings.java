
//manipulação de String

public class Strings {

	public static void main(String[] args) {
		String original = "ABCD efgh IJKL mNoPqR   ";
		
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2, 9);
		String s6 = original.replace('A', 'x');
		String s7 = original.replaceAll("ABC", "XXX");
		int i = original.indexOf("JK");
		int j = original.lastIndexOf("CD");
		
		System.out.println(original);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(i);
		System.out.println(j);
		
	}

}
