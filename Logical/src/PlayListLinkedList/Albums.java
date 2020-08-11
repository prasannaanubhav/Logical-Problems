package PlayListLinkedList;

import java.util.List;

public class Albums {

	private List<Songs> songsList;

	public Albums() {

	}

	public Albums(List<Songs> songsList) {
		this.songsList = songsList;
	}

	public List<Songs> getSongsList() {
		return songsList;
	}

	public void setSongsList(List<Songs> songsList) {
		this.songsList = songsList;
	}

	@Override
	public String toString() {
		return "Albums" + songsList;

	}
}
