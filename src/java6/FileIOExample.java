package java6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try{
		File f = new File ("sample2.txt");
		System.out.println(f.exists());
		FileReader fw = new FileReader(f);
		System.out.println(f.exists());
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
