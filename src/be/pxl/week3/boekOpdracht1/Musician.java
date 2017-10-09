package be.pxl.week3.boekOpdracht1;

public class Musician {
	public void play(){
		Instrument instrument = new Instrument();
		instrument.makeNoise();
	}
	
	public class Instrument{
		public void makeNoise(){
			System.out.println("tuutuutuut");
		}
	}
}
