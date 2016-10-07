public class Circle2 extends Shape2{
	protected double radius;

	public Circle2(){
		radius = 1.0;
	}
	public Circle2(double radius){
		this.radius = radius;
	}
	public Circle2(double radius, String color, boolean filled){
		super(color,filled);
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getArea(){
		return ((radius*radius) * 3.14159265359);
	}
	public double getPerimeter(){
		return ((2*3.14159265359) * radius);
	}
	@Override
	public String toString(){
		return "A Circle with radius " + getRadius() + " which is a subclass of " + super.toString();
	}
}