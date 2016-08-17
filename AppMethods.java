package musicapp;

public interface AppMethods {


	void addPlaylist(Playlist playlist);
	void addAlbum(Album album);
	int searchSong(Song song, Playlist playlist);
	int searchSong(Song song, Album album);
	int numberOfSongs();
	int numberofPlaylist();
	int numberofAlbum();
	void play(String str, int number);
	void currentSongDetails();
}
