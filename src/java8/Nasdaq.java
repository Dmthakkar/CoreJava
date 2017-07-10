package java8;

import java.math.BigInteger;
import java.util.Scanner;

public class Nasdaq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Nasdaq nasdaq = new Nasdaq();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the value of N :");
			int n = scanner.nextInt();
			System.out.println("Enter the value of C :");
			int c = scanner.nextInt();
			nasdaq.calc(n,c);
		}catch (Exception e){
			System.out.println("Wrong Argument");
		}
	}

	public void calc(int n, int c){
		BigInteger sum = new BigInteger("0");
		BigInteger multiply = new BigInteger("0");
		for(int i = 1;i <= n; i++){
			//System.out.println(" i is :"+i);
			multiply = BigInteger.valueOf(i==1?0:1);
			for (int j = (i-c > 0)?(i - c):1; j < i; j++){
				//System.out.println(" j is :"+j);
				multiply = multiply.multiply(BigInteger.valueOf(j));
			}		
			System.out.println(multiply + " + ");
			sum = sum.add(multiply);			
		}
		System.out.println(" sum is :"+sum);
	}
	
}
