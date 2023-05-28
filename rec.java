package recursion;

public class rec {

	private static int factorial(int x) {
		
		if(x==0||x==1)   // IF N IS 0 
		{
         return 1;
		}
		
		else {
			 return x*factorial(x-1);

		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		
		System.out.println(" the value of factorial is : "+factorial(x));

	}


}
