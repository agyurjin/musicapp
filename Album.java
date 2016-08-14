package musicapp;

import java.util.ArrayList;
import java.util.List;

public class Album {

	List<Song> album = new ArrayList<Song>();
	private int numberofSongs = album.size();
	
	public int getNumberofSongs() {
		return this.numberofSongs;
	}
	
	public void addSong(Song newSong){
		album.add(newSong);
	}
	
	public Song getSong(int number){
		return album.get(number);
	}
}