package PlayListLinkedList;

public class Songs {

	private String songName;
	private double songDuration;

	public Songs() {

	}

	public Songs(String songName, double songDuration) {
		this.songName = songName;
		this.songDuration = songDuration;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public double getSongDuration() {
		return songDuration;
	}

	public void setSongDuration(double songDuration) {
		this.songDuration = songDuration;
	}

	@Override
	public String toString() {
		return "songName=" + songName + ", songDuration=" + songDuration ;
	}
	
	

}
