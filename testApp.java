package youtube_series;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class testApp {
public static void main(String[] args ) throws IOException 
{
	 char ch;
	 int value;
	 Scanner sc = new Scanner(System.in);
	 
	BinerySearchTree tree = new BinerySearchTree();
	
	 
	tree.insert(13567, 78.0);
	tree.insert(13675, 88.0);
	
	tree.insert(13567, 78.0);
	tree.insert(13674, 88.0);
	
	tree.insert(13563, 78.0);
	tree.insert(13671, 88.0);
	
	tree.insert(13567, 78.0);
	tree.insert(13671, 84.0);
	
	tree.insert(13567, 78.0);
	tree.insert(13675, 85.0);
	
	tree.insert(13567, 72.0);
	tree.insert(13625, 82.0);
	
while(true)
{
		System.out.println("Enter first latter of show, \n Insert \n Find \n Tarverse \n delete \n ");
	    ch = getchar();
	    
	    switch(ch) {
	    case 'S':
	    	
	    	tree.displayTree();
	    	break;
	    	
	    case 'I':
	    	
	    	System.out.println("Entr the value to insert: \n");
	    	 value = getInt();
	    	tree.insert(value, value*0.9);
	    	
	    	break;
	    case 'f':
	    	
//	    	System.out.println("Enter the value for finding items: ");
//	    	value = getInt();
//	    	
//	    	Node found = tree.
	    	break;
	    
	    case 'd':
	    	System.out.println("Enter the value for delete items: ");
	    	value = getInt();
	    	
	    	boolean didDelete = tree.delele(value);
	    	if(didDelete) {
	    		System.out.println("Deleted value : "+value);
	    	}
	    	else {
	    		System.out.println("Could not delete");
	    		System.out.println(value+" ");
	    		break;
	    	}
	    	
	    case 'T':
	    	
	    	System.out.println("Enter the type 1 2  or 3: ");
	    	value  = getInt();
	    	tree.terverse(value);
	    	break;
	    	
	    	default:
	    		System.out.println("Invalid input");
	    	
	    	
	    } // end switch
	    
	    
}// end while
// end main
}


private static String getSrting() throws IOException{
	
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
String s = br.readLine();

	return s;
}


private static char getchar() throws IOException {
	
	
	String s = getSrting();
	
	return s.charAt(0);
	
}

public static int getInt() throws IOException
{
	
	String s  = getSrting();
	return Integer.parseInt(s);
	
	
}

}



