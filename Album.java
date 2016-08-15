package musicapp;

import java.util.ArrayList;
import java.util.List;

public class Album {

	List<Song> albumSong = new ArrayList<Song>();
	private int numberofSongs;
	
	public void addSong(Song newSong){
		this.albumSong.add(newSong);
		this.numberofSongs = this.albumSong.size();
	}
	
	public Song getSong(int number){
		return this.albumSong.get(number);
	}

	public int getNumberofSongs() {
		return this.numberofSongs;
	}
}