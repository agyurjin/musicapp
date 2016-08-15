package musicapp;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	List<Song> playListSong = new ArrayList<Song>();
	private int numberofSongs;

	public void addSong(Song newSong){
		this.playListSong.add(newSong);
		this.numberofSongs = this.playListSong.size();
	}
	
	public Song getSong(int index){
		return this.playListSong.get(index);
	}

	public void addAlbum(Album album){
		for(int i = 0; i < album.getNumberofSongs(); i++){
			this.playListSong.add(album.getSong(i));
		}
	}
	
	public int getNumberofSongs(){
		return this.numberofSongs;
	}	
}