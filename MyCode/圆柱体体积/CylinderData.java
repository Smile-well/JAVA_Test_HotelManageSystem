package test_1;

public class CylinderData extends CircleData{
	private double length=1.0;

	public CylinderData() {
	}
	public CylinderData(double length) {
		this.length=length;
	}
	
	public double getLength() {
		return length;
	}	

	public void setLength(double length) {
		this.length = length;
	}
	public double findArea(){
		return pai*getRadius()*getRadius();
	}
	public double findVolume(){
		return findArea()*length;
	}
}