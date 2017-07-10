package algorithm;

import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Scanner;

public class Md5Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	        MessageDigest md;
			try {
				FileInputStream fis;
				Scanner scanner = new Scanner(System.in);
				byte[] bytesOfMessage = scanner.next().getBytes("UTF-8");
				md = MessageDigest.getInstance("MD5");
		        byte[] mdbytes = md.digest(bytesOfMessage);
		        
		      //convert the byte to hex format method 1
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < mdbytes.length; i++) {
		          sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
		        }

		        System.out.println(sb.toString());
		        
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
