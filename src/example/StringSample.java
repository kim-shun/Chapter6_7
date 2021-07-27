package example;

public class StringSample {

	public static void main(String[] args) {
		String str1 = "123";
		System.out.println("str1 = " + str1);
		System.out.println("str1.length() → " + str1.length());
		
		System.out.println("----------------------");
		String str2 = "あいう";
		System.out.println("str2 = " + str2);
		System.out.println("str2.length() → " + str2.length());

		String str3 = "ABCdef";
		System.out.println("str3 = " + str3);
		
		String str3Tolower = str3.toLowerCase();
		System.out.println("str3.toLowerCase() → " + str3Tolower);
	}

}
