package sortingPackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DueueArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Character> deque = new ArrayDeque<>();
		deque.add('a');
		deque.add('b');
		deque.add('c');
		deque.add('d');
		deque.add('e');
		deque.add('f');
		System.out.println(deque);
		deque.pop();
		System.out.println(deque);
		deque.addFirst('z');
		System.out.println(deque);
		System.out.println(deque.contains('a'));
//		deque.clear();
//		System.out.println(deque);
		Iterator<Character> iterator=deque.descendingIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		System.out.println(deque.descendingIterator());
		
	}

}
