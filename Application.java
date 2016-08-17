package musicapp;

import java.util.ArrayList;
import java.util.List;

public class Application implements AppMethods{

	private List<Playlist> playlist = new ArrayList<Playlist>();
	private List<Album> album = new ArrayList<Album>();

	private int currentSong;
	private int currentPlaylist = -1;
	private int currentAlbum = -1;
	private int playlistNumber;
	private int albumNumber;
	private int numberofSongs;
	
/*
	class PlayableItem {
		private boolean isPlaylist;

		public List<Song> getAllSongsToPlay() {
			if (isPlaylist) {
				
			}
				
		}
	}
*/
	@Override
	public void addPlaylist(Playlist playlist) {
		this.playlist.add(playlist);
		this.playlistNumber = this.playlist.size();
	}
	
	@Override
	public void addAlbum(Album album) {
		this.album.add(album);
		this.albumNumber = this.album.size();
	}
	
	@Override
	public int searchSong(Song song, Playlist playlist) {
		String songName = song.getName();
		
		for(int i = 0; i < playlist.getNumberofSongs(); i++) {
			if(playlist.getSong(i).getName().equals(songName))
				return i;
		}
		return -1;
	}
	
	@Override
	public int searchSong(Song song, Album album) {
		String songName = song.getName();
		
		for(int i = 0; i < album.getNumberofSongs(); i++) {
			if(album.getSong(i).getName().equals(songName))
				return i;
		}
		return -1;
	}
	
	@Override
	public int numberOfSongs() {
		return this.numberofSongs;
	}

	@Override
	public int numberofPlaylist() {
		return this.playlistNumber;
	}

	@Override
	public int numberofAlbum() {
		return this.albumNumber;
	}
	
	public void play(String str, int number) {

		if(str == "playlist"){
			for(int i = 0; i < this.playlist.get(number).getNumberofSongs();i++){
				System.out.println((this.playlist.get(number).getSong(i)).toString());
				this.currentSong = i;
			}
			this.numberofSongs = playlist.get(number).getNumberofSongs();
			this.currentPlaylist = number;
		}
		else {
			for(int i = 0; i < this.album.get(number).getNumberofSongs();i++){
				System.out.println((this.album.get(number).getSong(i)).toString());
				this.currentSong = i;
			}
			this.numberofSongs = album.get(number).getNumberofSongs();
			this.currentAlbum = number;
			
		}
	}

	@Override
	public void currentSongDetails() {
			if(currentAlbum == -1)
				System.out.println((playlist.get(currentPlaylist).getSong(currentSong)).toString());
			else
				System.out.println((playlist.get(currentAlbum).getSong(currentSong)).toString());
				
	}

}