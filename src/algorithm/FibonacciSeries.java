package algorithm;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10; i++){
			System.out.println(fibonacci2(i));
		}
	}
	
	public static int fibonacci(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int fibonacci2(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		int sum = 1;
		int f1 = 1;
		int f2 = 1;
		for(int i = 3; i <= n;i++){
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
		}
		return sum;
	}

}
