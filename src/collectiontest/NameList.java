package collectiontest;

import java.util.*;
public class NameList {
	private List names = Collections.synchronizedList(new LinkedList());
	public void add(String name) {
		names.add(name);
	}
	public String removeFirst() {
		System.out.println(" Calling removeFirst for Thread: " + Thread.currentThread().getName());
		if (names.size() > 0){
			System.out.println(" Calling names.size() for Thread: " + Thread.currentThread().getName() + ", names.size():"+names.size());
			String r = (String) names.remove(0);
			System.out.println(" Calling r for Thread: " + Thread.currentThread().getName() + ", r:"+r);
			return r;
		}else{
			System.out.println(" Returing null for Thread: " + Thread.currentThread().getName());
			return null;
		}
	}

	public static void main(String[] args) {
		final NameList nl = new NameList();
		nl.add("Ozymandias");
		class NameDropper extends Thread {
			public void run() {
				System.out.println("Calling run for :"+Thread.currentThread().getName());
				String name = nl.removeFirst();
				System.out.println("Thread: " + Thread.currentThread().getName() + ", name:" +name);
				System.out.println("Ending run for :"+Thread.currentThread().getName());
			}
		}
		Thread t1 = new NameDropper();
		Thread t2 = new NameDropper();
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
}