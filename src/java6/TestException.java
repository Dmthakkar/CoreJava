package java6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		TestException te = new TestException();
		System.out.println("2");
		te.testMethod();
		System.out.println("3");
	}
	
	public void testMethod() {
		System.out.println("4");
		throwExample();
		System.out.println("5");
	}

	public void throwExample(){ //throws Exception{
//		throw new IOException();
		try{
			System.out.println("6");
			String s = null;
			s.length();
			System.out.println("7");
		}catch(Exception e){
//			throw e;
		}finally{
			System.out.println("8");
		}
		System.out.println("9");
	}
}
