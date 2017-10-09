package be.pxl.week3.opdracht1;

import java.util.ArrayList;

public class Gearbox {
	private int maxGears;
	private boolean clutchIsIn;
	private ArrayList<Gear> list = new ArrayList<>();
	private int currentGear = 0;
	private double speed;
	
	public Gearbox(int gears){
		this.maxGears = gears;
		for(int i = 0; i <= maxGears; i++){
			addGear(new Gear(i, (i*5.3)));
		}
	}
	
	public void operateClutch(boolean clutch){
		this.clutchIsIn = clutch;
	}
	
	public void addGear(Gear gear){
		list.add(gear);
	}
	
	public void changeGear(int newGear){
		currentGear = newGear;
		if(currentGear >= 0 && currentGear <= maxGears && clutchIsIn == true){
			System.out.println("Gear " + newGear + " selected.");
		} else {
			System.out.println("Grind!");
			currentGear = 0;
		}
	}
	
	public double wheelSpeed(int revs){
		if(clutchIsIn == true){
			System.out.println("Grind!");
			speed = 0;
		}else{
			speed = list.get(currentGear).driveSpeed(revs);
		}	
		return speed;
	}
	
	private class Gear{
		private int gearNumber;
		private double ratio;
		
		public Gear(int gearNumber, double ratio){
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}
		
		public double driveSpeed(int revs){
			return revs * ratio;
		}
	}
}
