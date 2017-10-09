package be.pxl.week3.boekOpdracht3;

public class Musician {
	public void play(){
		Instrument anonymous = new Instrument(){
			public void makeNoise(){
				System.out.println("tuutuutuut");
			}
		};	
		anonymous.makeNoise();
	}
}
