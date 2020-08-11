package MyLinkedList;

public class ServiceImpl {

	ListItem listItem = new ListItem();
	public void addItem(String item, boolean loop) {

		if (loop == true) {
			listItem.setNode(item);
		}
		boolean returnValue = compareItem(listItem.getNode(), item);
		if (!returnValue) {
			listItem.setNode(item);
		}
	}

	public boolean compareItem(String node, String s2) {

		if (s2 == null) {
			return false;
		}

		int compare = node.compareTo(s2);

		if (compare < 0) {
			listItem.setPreviousItem(node);
			return true;
		}
		if (compare > 0) {
			listItem.setNode(s2);
			listItem.setNextitem(node);
			System.out.println(s2);
			System.out.println(node);
			return true;
		}

		return false;

	}

}
