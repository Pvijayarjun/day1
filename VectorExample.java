package sortingPackage;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.add(6);
		vector.add(7);
		vector.add(8);
		vector.add(9);
		System.out.println(vector);
		
		Iterator<Integer> iterator = vector.iterator();
		 
		while(iterator.hasNext())
		{
		int num = iterator.next();
		if(num%2==0) {
			System.out.println(num);
		}
		 
	
	}

	}
}
