package ExceptionPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
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
		 
		Iterator iterator = list.iterator();
		 
		while(iterator.hasNext())
		{
		System.out.println(iterator.next());
		}
		 
		 
		//System.out.println(list);//toString
		//list = new LinkedList
		//CalculatorInterface cinterface = new CalculatorInferfaceImpl();
		 
		}
		 
		}


