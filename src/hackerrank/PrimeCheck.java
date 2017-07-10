package hackerrank;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeCheck p = new PrimeCheck();
		p.checkPrime(3);
		p.checkPrime(3,8);
		p.checkPrime(3,8,6);
		p.checkPrime(3,8,6,1,4);
	}

	public void checkPrime(int... n){
		int count=0;
		for(int i:n){
			String prime = isPrime(i);
			System.out.print(prime);
			if(count++ != n.length && !"".equals(prime) ){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	public String isPrime(int n){
		if(n < 2) return "";
		if(n == 2) return "2";
		for(int i = 2; i<n; i++){
			if(n%i == 0){
				return "";       
			}
		}
		return n+"";
	}
}


