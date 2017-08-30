package quaderberechnungen;

public class QuaderRechner {

	private double length, width, height;
	
	public QuaderRechner(double length, double width, double height) {
		
		this.height = height;
		this.length = length;
		this.width = width;
	}
	
	public double getVolume() {
		return (length * height * width);
	}
	
	public double getSurfaceArea() {
		double s1 = length * height;
		double s2 = length * width;
		double s3 = width * height;
		
		return (2* (s1 + s2 + s3));
	}
	
	public double getBorderLength() {
		return (3 * (height + width + length));
	}
}
