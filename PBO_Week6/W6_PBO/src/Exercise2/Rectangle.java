package Exercise2;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle() { 
		this.width = 1.0;
		this.length = 1.0;
	}
	
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public Rectangle(double w, double l) {
		this.width = w;
		this.length = l;
	}
	
	public Rectangle(double w, double l, String c, boolean f) {
		super(c, f);
		this.width = w;
		this.length = l;
	}
	
	public double getArea() {
		return this.length*this.width;
	}
	
	public double getPerimeter() {
		return 2*(this.length + this.width);
	}
	
	@Override
	public String toString() {
		return "A rectangle with width = " + this.width + " and length = " + this.length + "which is a subclass of " + super.toString(); 
	}


}