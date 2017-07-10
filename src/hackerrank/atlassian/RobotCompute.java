package hackerrank.atlassian;

import java.util.Arrays;

public class RobotCompute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Output for PLPLPLPLPLPLPLPLPLPL:"+compute("PLPLPLPLPLPLPLPLPLPL"));
	}

	public static String compute(String instructions){
		int output[] = {0,0,0,0,0,0,0,0,0,0};
		int index=0;
		for(int i=0;i<instructions.length();i++){
			switch(instructions.charAt(i)){
				case 'P':
					index=0;
					break;
				case 'M':
					index++;
					break;
				case 'L':
					output[index]++;
					break;
				default:
					break;
			}			
		}
		String reverse = "";
		for(int i:output){
			reverse += Integer.toHexString(i);
		}
		return reverse.toUpperCase();
	}
}
