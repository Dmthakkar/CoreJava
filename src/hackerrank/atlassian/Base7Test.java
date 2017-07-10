package hackerrank.atlassian;

import java.util.Scanner;

public class Base7Test {

	public static void main(String[] args){
	   char [] b7={'0','a', 't', 'l', 's', 'i', 'n'};
       Scanner in = new Scanner(System.in);
       System.out.print("Enter int :");
       int t = in.nextInt();

       int i=t;
       StringBuffer sb = new StringBuffer();
       while (i>0){
           int m=i%7;
           sb.append(b7[m]);
           i=i/7;
       }

       System.out.println(sb.reverse());
       in.close();
	}
}
