import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
	
	
	public static void addInOrder(LinkedList<String> linkList, String city) {
		
		ListIterator<String> iterator = linkList.listIterator();

		if(!iterator.hasNext()) {
			iterator.add(city);
		}
		while(iterator.hasNext()) {
			int comparison = iterator.next().compareTo(city);
			if(comparison==0) {
				System.out.println("city is already been added");
			}
			else if(comparison>0) {
				iterator.previous();
				iterator.add(city);
			}else {
				iterator.add(city);
			}
		}
		
		printList(iterator);
		
	}
	
	public static void printList(ListIterator<String> iterator) {
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
 
		LinkedList<String> linkList = new LinkedList<>();

		addInOrder(linkList, "Adelaide");
		addInOrder(linkList, "Sydney");

	}

}
