package ExceptionPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();//array --contiguous memory--dynamically growable
		list.add(100);//autoboxing --wrapper class
		list.add(100);
		list.add(Integer.valueOf(200));
		list.add(Double.valueOf(34.45));
		list.add("Mahesh");
		list.add("Vijay");
		list.add(true);
		 
		//traversing the list
		//Iterator interface
		 
		int intc=0, dcnt=0, bcnt=0, scnt=0;
		Iterator iterator = list.iterator();
		 
		while(iterator.hasNext())
		{
		Object obj = iterator.next();
		if(obj instanceof Double)
		dcnt++;
		else if(obj instanceof Integer)
		intc++;
		else if(obj instanceof String)
		scnt++;
		else if(obj instanceof Boolean)
		bcnt++;
		else
		System.out.println("not required");
		}
		System.out.println(dcnt +" "+ intc+" "+scnt+" "+bcnt);
	}
}
