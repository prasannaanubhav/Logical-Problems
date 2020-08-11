package PlayListLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CliMain {

	public static List<Albums> loadSongs() {

		Songs song1 = new Songs("Numb", 3.07);
		Songs song2 = new Songs("In The End", 4.07);
		Songs song3 = new Songs("Paperback", 2.27);
		Songs song4 = new Songs("Heavy", 3.43);
		Songs song5 = new Songs("One Step closer", 2.57);

		Songs coldPlay1 = new Songs("Paradise", 5.46);
		Songs coldPlay2 = new Songs("Atlas", 3.09);
		Songs coldPlay3 = new Songs("Up & Up", 4.17);
		Songs coldPlay4 = new Songs("Everglow", 4.01);

		List<Songs> songList = new ArrayList<>();
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		songList.add(song4);
		songList.add(song5);

		List<Songs> songList2 = new ArrayList<>();
		songList2.add(coldPlay1);
		songList2.add(coldPlay2);
		songList2.add(coldPlay3);
		songList2.add(coldPlay4);

		Albums album1 = new Albums();
		album1.setSongsList(songList);

		Albums album2 = new Albums();
		album2.setSongsList(songList2);

		List<Albums> albumList = new ArrayList<>();
		albumList.add(album1);
		albumList.add(album2);

		return albumList;
	}

	public static void main(String[] args) {

		List<Albums> albumList = loadSongs();
		LinkedList<Albums> albumLinkedList= new LinkedList<>(albumList);
		PlayList playlist = new PlayList(albumLinkedList);
		Iterator<Albums> iterator = playlist.getAlbumList().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		System.out.println("===========================");
		for(int i =0;i<playlist.getAlbumList().get(0).getSongsList().size();i++) {
			System.out.println(playlist.getAlbumList().get(0).getSongsList().get(i).getSongName()+" "+playlist.getAlbumList().get(0).getSongsList().get(i).getSongDuration() );
		}
		System.out.println("====================================");
		
		for(int i =0;i<playlist.getAlbumList().get(1).getSongsList().size();i++) {
			System.out.println(playlist.getAlbumList().get(1).getSongsList().get(i).getSongName()+" "+playlist.getAlbumList().get(1).getSongsList().get(i).getSongDuration() );
		}

	}

}
