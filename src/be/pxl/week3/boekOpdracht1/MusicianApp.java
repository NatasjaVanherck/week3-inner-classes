package be.pxl.week3.boekOpdracht1;

public class MusicianApp {

	public static void main(String[] args) {
		Musician muziekant = new Musician();
		muziekant.play();
		
		Musician.Instrument instru = muziekant.new Instrument();
		instru.makeNoise();
	}
}
