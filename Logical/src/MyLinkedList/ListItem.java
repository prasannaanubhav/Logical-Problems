package MyLinkedList;

public class ListItem {

	private String node;
	private String nextitem;
	private String previousItem;

	public ListItem() {

	}

	public ListItem(String node, String item, String newItem) {
		this.node = node;
		this.nextitem = item;
		this.previousItem = newItem;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public String getNextitem() {
		return nextitem;
	}

	public void setNextitem(String nextitem) {
		this.nextitem = nextitem;
	}

	public String getPreviousItem() {
		return previousItem;
	}

	public void setPreviousItem(String previousItem) {
		this.previousItem = previousItem;
	}

}
