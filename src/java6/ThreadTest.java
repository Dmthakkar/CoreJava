package java6;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread();
		Thread t2 = new Thread();

		t1.start();
		t2.start();
//		t1.join();
//		t1.sleep(10000);
//		t1.yield();
//		t1.notify();
//		t1.notifyAll();
		System.out.print("X");
	//	synchronized (t1){
//		t2.wait(100);
	//	}
		System.out.print("Y");
		
		
		System.out.print("1 ");
		synchronized(args){
			System.out.print("2 ");
			try {
				args.wait();
			}
			catch(InterruptedException e){}
		}
		System.out.print("3 ");
		
		ThreadTest tt = new ThreadTest();
		tt.test();

	}
	
	public void test() {
		// TODO Auto-generated method stub
		ThreadTest tt1 = new ThreadTest();
		ThreadTest tt2 = new ThreadTest();
		System.out.print("1 ");
		synchronized(tt1){
			System.out.print("2 ");
			try {
				tt2.wait();
			}
			catch(InterruptedException e){ e.printStackTrace();}
		}
		System.out.print("3 ");
	}
	
}
