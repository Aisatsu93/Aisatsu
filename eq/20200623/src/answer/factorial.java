package answer;


public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(String.format("3Fac: %d", factorial(3)));
		System.out.println(String.format("12Fac: %d", factorial(12)));
				
	}
	public static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return n * factorial(n-1);
	}

}
