package musicapp;

public class RunApp {

	public static void main(String[] args){

			Song song1 = new Song("name1", "style1", "Singer1", 2.5, 3.1);
			Song song2 = new Song("name2","style1", "Singer2", 3.5, 2.6);
			
			Song song3 = new Song("name3", "style2", "Singer1", 5.0, 1.8);
			Song song4 = new Song("name4", "style3", "Singer2", 3.4, 4.2);
			Song song5 = new Song("name5", "style4", "Singer3", 2.6, 3.1);
			Song song6 = new Song("name6", "style5", "Singer4", 1.8, 2.3);

			Album album1 = new Album();
			album1.addSong(song1);
			album1.addSong(song2);

	}
}