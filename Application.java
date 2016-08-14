package musicapp;

import java.util.ArrayList;
import java.util.List;

public class Application implements AppMethods{

	private int currentSong;
	private int playlistNumber;
	private int albumNumber;
	private List<Playlist> playlist = new ArrayList<Playlist>();
	private List<Album> album = new ArrayList<Album>();

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
	public void play(int index, boolean isPlaylist) {
		if(isPlaylist){
			for(int i = 0; i<playlist.get(index).getNumberOfSongs();i++){
				System.out.println((playlist.get(index).getSong(i)).toString());
				this.currentSong = i;
			}
		} else{
				for(int i = 0; i<album.get(index).getNumberofSongs();i++){
					System.out.println(album.get(index).getSong(i).toString());
					this.currentSong = i;
				}
		}
	}
}
	
/*	
	@Override
	public void SearchSong(Song song) {
	}

	@Override
	public Song currentSong(int songNumber) {
		return playlist.getSong(songNumber);
	}

	@Override
	public int numberOfSongs() {
		return playlist.getNumberOfSongs();
	}

	@Override
	public void SongDetails(int songNumber) {
		System.out.println((playlist.getSong(songNumber)).toString());
	}
*/