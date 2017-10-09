package be.pxl.week3.boekOpdracht2;

public class Musician {
	public void play(){
		class Instrument{
			public void makeNoise(){
				System.out.println("tuutuutuut");
			}
		}	
		Instrument instrument = new Instrument();
		instrument.makeNoise();
	}
}
