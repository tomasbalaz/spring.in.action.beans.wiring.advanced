package spring.in.action.beans.wiring.advanced.model;

public class BlankDisc {
	
	private String title;
	
	private String artist;

	public BlankDisc(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
}
