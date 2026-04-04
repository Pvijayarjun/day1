package sortingPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String name = sc.next();
		
		Set<Character> set= new HashSet<>();
		char[] arr =name.toCharArray();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		StringBuilder res=new StringBuilder();
		Iterator<Character> iterator = set.iterator();
				while(iterator.hasNext()) {
					res.append(iterator.next());
					
				}
		System.out.print(res);
		
	}

}
