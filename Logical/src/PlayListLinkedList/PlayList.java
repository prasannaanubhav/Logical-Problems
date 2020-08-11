package PlayListLinkedList;

import java.util.LinkedList;

public class PlayList {

	private LinkedList<Albums> albumList = new LinkedList<>();

	public PlayList() {

	}

	public PlayList(LinkedList<Albums> albumList) {
		this.albumList = albumList;
	}

	public LinkedList<Albums> getAlbumList() {
		return albumList;
	}

	public void setAlbumList(LinkedList<Albums> albumList) {
		this.albumList = albumList;
	}

}
