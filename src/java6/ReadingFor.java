package java6;

import java.io.*;

public class ReadingFor {

	public static void main(String[] args) {
		String s = null;
		
		if(s instanceof String){
			
		}
		String pw;
		ReadingFor rf;
		
	
		try {
			FileReader fr = new FileReader("myfile.txt");
			BufferedReader br = new BufferedReader(fr);
			while((s = br.readLine()) != null)
				System.out.println(s);
			//br.flush();
		}
		catch (IOException e) { System.out.println("io error"); }
		//if(rf.equals(new ReadingFor())){
			
		//}
	}
}
