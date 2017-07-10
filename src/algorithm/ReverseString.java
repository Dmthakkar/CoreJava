package algorithm;

public class ReverseString {

	public static void main(String args[]) {

		//original string
		String str = "Sony is going to introduce Internet TV soon";
		System.out.println("Original String: " + str);

		//reversed string using Stringbuffer
		String reverseStr = new StringBuffer(str).reverse().toString();
		System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

		//iterative method to reverse String in Java
		reverseStr = reverse(str);
		System.out.println("Reverse String in Java using Iteration: " + reverseStr);

		//recursive method to reverse String in Java
		reverseStr = reverseRecursively(str);
		System.out.println("Reverse String in Java using Recursion: " + reverseStr);
		
		str = "abc";
		System.out.println("str.length()" + str.length());
		System.out.println("str.substring(0)" + str.substring(0));
		System.out.println("str.substring(1)" + str.substring(1));
		
		System.out.println("str.substring(0,str.length())" + str.substring(0,str.length()));
		System.out.println("str.substring(0,str.length()-1)" + str.substring(0,str.length() -1));
		System.out.println("str.substring(1,3)" + str.substring(1,3));
		
	}

	public static String reverse(String str) {
		StringBuilder strBuilder = new StringBuilder();
		char[] strChars = str.toCharArray();

		for (int i = strChars.length - 1; i >= 0; i--) {
			strBuilder.append(strChars[i]);
		}

		return strBuilder.toString();
	}

	public static String reverseRecursively(String str) {

//		System.out.println(" reverseRecursively Calling str: "+ str);
		//base case to handle one char string and empty string
		if (str.length() < 2) {
//			System.out.println(" reverseRecursively returing str: "+ str);
			return str;
		}
//		System.out.println(" reverseRecursively befor returing str.substring(1): "+ str.substring(1) + ", str.charAt(0):"+ str.charAt(0));
		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}
}
