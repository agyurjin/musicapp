package musicapp;

public interface AppMethods {


	void addPlaylist(Playlist playlist);
	void addAlbum(Album album);
	int searchSong(Song song, Playlist playlist);
	int searchSong(Song song, Album album);
	int numberOfSongs();
	int numberofPlaylist();
	int numberofAlbum();

	void play(int number);
	void play(Album album);

	/*
	void currentSongDetails();
	Song currentSong();
*/	
}
