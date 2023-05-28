package demo;

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
 
//import edu.princeton.cs.algs4.Stack;
 
public class Evaluate {
	public static void main(String[] args){
		Stack<String> ops=new Stack<String>();
		Stack<Double> values=new Stack<Double>();
		Scanner sc=new Scanner(System.in);
//		String next =sc.nextLine();
		String[] expression = sc.nextLine().split("\s+");
		Queue<String> que=new LinkedList<String>();
		for (String x : expression)
			que.add(x);
		while(!que.isEmpty()){
			//push if operator
			String s=que.poll();
			if(s.equals("("))	;
			else if(s.equals("+")) 
				{ops.push(s);}
			else if(s.equals("-"))	
				{ops.push(s);}
			else if(s.equals("*"))
				{ ops.push(s);}
			else if(s.equals("/"))	
				{ops.push(s);}
			else if(s.equals("sqrt")) 
				{ops.push(s);}
			else if(s.equals(")")){
			//pop,evaluate and push result if token is")"
				String op=ops.pop();
				double v=values.pop();
				if(op.equals("+"))	
					{v=values.pop()+v;}
				else if(op.equals("-"))
					{v=values.pop()-v;}
				else if(op.equals("*"))
					{v=values.pop()*v;}
				else if(op.equals("/"))
					{v=values.pop()/v;}
				else if(op.equals("sqrt"))
					{
					   v=Math.sqrt(v);
						values.push(v);
					}				
			}
			else 
				{values.push(Double.parseDouble(s));}
		}
		System.out.print(values.pop());
	}
}