package java6;

class Dudes {
	static long flag = 0;
	// insert code here
	void chat(long id) {
		if(flag == 0) flag = id;
		for(int x = 1; x < 3; x++) {
			System.out.print(id + " ");
			//if(flag == id) System.out.print("yo ");
			//else System.out.print("dude ");
			Thread.yield();
		}
	}
}
public class DudesChat implements Runnable {
	static Dudes d;
	public static void main(String[] args) {
		new DudesChat().go();
	}
	void go() {
		d = new Dudes();
		new Thread(new DudesChat()).start();
		new Thread(new DudesChat()).start();
	}
	public void run() {
		d.chat(Thread.currentThread().getId());
	}
}