package youtube_series;

public class Node {

	int idata;
	double ddata;
	Node left;
	Node right;
	
	
	public void displayNode()
	{
		System.out.println('{');
		System.out.println(idata);
		System.out.println(", ");
		System.out.println(ddata);
		System.out.print("} ");
	}
}
// end class

