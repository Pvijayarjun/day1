package ExceptionPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample2 {

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
		 
		List list1 = new ArrayList();
		list1.add("bangalore");
		list1.add("Mangalore");
		list1.add("tumkur");
		 
		list.addAll(list1);
		list.add(2,list1.get(1));
		System.out.println(list.contains("mangalore"));
		System.out.println(list.indexOf("Vijay"));
		 
		 
		List l1 = new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		 
		List l2 = new ArrayList();
		l2.add(1);
		l2.add(2);
		l2.add(4);
		 
		System.out.println("comparing two lists l1 and l2"+ l1.equals(l2));
		//traversing the list
		//Iterator interface
		int intc=0, dcnt=0, bcnt=0, scnt=0;
		Iterator iterator = list.iterator();
		 
		/*while(iterator.hasNext())
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
		*/
		System.out.println(list);//toString
		//list = new LinkedList
		//CalculatorInterface cinterface = new CalculatorInferfaceImpl();
		 
		 
		ListIterator lIterator = list.listIterator();
		while(lIterator.hasNext())
		{
		lIterator.next();
		}
		while(lIterator.hasPrevious())
		{
		System.out.println(lIterator.previous());
		}
		}
	}


