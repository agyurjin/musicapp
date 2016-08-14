package musicapp;

public class Song {

	private String name;
	private String style;
	private String artistName;
	private double rating;
	private double duration;
	
	
	public Song(String name, String style, String artistName, double rating, double duartion) {
		this.name = name;
		this.style = style;
		this.artistName = artistName;
		this.rating = rating;
		this.duration = duartion;
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", style=" + style + ", artistName=" + artistName + ", rating=" + rating
				+ ", duration=" + duration + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
}