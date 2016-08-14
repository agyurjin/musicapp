package musicapp;

import java.util.ArrayList;
import java.util.List;


public class Playlist {

	List<Song> playListSong = new ArrayList<Song>();
	List<Album> playListAlbum = new ArrayList<Album>();	
	private int numberOfSongs = playListSong.size();
	private int numberOfAlbums = playListAlbum.size();

	public void addSong(Song newSong){
		playListSong.add(newSong);
	}
	
	public Song getSong(int index){
		return playListSong.get(index);
	}

	public void addAlbum(Album newAlbum){
		playListAlbum.add(newAlbum);
		for(int i = 0; i < newAlbum.getNumberofSongs();i++)
			playListSong.add(newAlbum.getSong(i));
	}
	
	public Album getAlbum(int index){
		return playListAlbum.get(index);
	}
	
	public int getNumberOfSongs(){
		return this.numberOfSongs;
	}
	
	public int getNumberOfAlbums(){
		return this.numberOfAlbums;
	}
	
}
