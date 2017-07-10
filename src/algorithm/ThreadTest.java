package algorithm;

public class ThreadTest extends Thread{

	Employee e1;
	
	ThreadTest(Employee e1){
		this.e1 = e1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(10);
		ThreadTest t1 = new ThreadTest(e1);
		t1.setName("t1");
		t1.start();
		ThreadTest t2 = new ThreadTest(e1);
		t1.setName("t2");
		t2.start();
		
	}
	
	public void run(){
		setEmpId(e1);
		getEmpId();
		
	}
	
	public void setEmpId(Employee e1){
		System.out.println("Calling setEmp for Thread" + Thread.currentThread().getName() + " : e1:"+e1);
		this.e1.setId(e1.getId());
		System.out.println("Calling setEmp : e1:"+e1);
	}
	
	public int getEmpId(){
		System.out.println("Calling getEmp for Thread" + Thread.currentThread().getName());
		return e1.getId();
	}
}

class Employee{
	int id;

	Employee(int id){
		this.id = id;
	}
	
	public void setId(int id){
		System.out.println("Calling setId for Thread" + Thread.currentThread().getName() + " : id:"+id);
		synchronized(this){
			try{
				this.id = id;
			}catch(Exception e){
				e.printStackTrace();
			}
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}

		}
	}
	
	public synchronized int getId(){
		System.out.println("Calling getId for Thread" + Thread.currentThread().getName());
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}

		return this.id;
	}
	
}