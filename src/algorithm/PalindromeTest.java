package algorithm;

import java.util.Scanner;

public class PalindromeTest{

	public static void main(String[] args){
		//Scanner scanner = new Scanner(System.in);
		int[] numbers = {1, 20, 22, 102, 101, 1221, 13321, 13331, 0, 11};

		for(int i : numbers){
			System.out.println(" number " + i + " palindrome result is :"+ isPalindrome(i));
		}	
	}
	public static boolean isPalindrome(int number){
		if(number == reverse(number)){
			return true;
		}
		return false;
	}

	public static int reverse(int number){
		int reverse = 0;

		while(number != 0){
			System.out.println("number:"+number+ ",reverse:" + reverse +",reverse*10:"+(reverse*10) + ",number%10 :"+(number%10));
			reverse = reverse*10 + number%10;
			number = number/10;
		}
		return reverse;
	}
}