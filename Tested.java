package demo;
import java.util.Scanner;

public class Tested {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter the String");
    String str = sc.next();
    
    printPermlate(str,"");
 
}

private static void printPermlate(String value, String asf) {  

	if(value.length()==0)
	{
		System.out.println(asf);   // ros = ans so for
		return;
	}
	
	int count = 0;
	for(int i=0;i<value.length();i++)
	{
		char ch = value.charAt(i);
		
		String qlPart = value.substring(0,i);  
		String qrPart = value.substring(i+1);
		
		String roq = qlPart+qrPart;  // ros = rest of que
		count++;
		printPermlate(roq, asf+ch);

	}
	if(count == 3 ) {
		System.out.println("Counted values are : "+count);
	}
}


}
