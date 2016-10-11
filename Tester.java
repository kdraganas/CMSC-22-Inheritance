import java.util.*;

public class Tester{
	public static void main(String[] args) {
		Shape2 s1 = new Circle2(5.5, "RED", false);  // Upcast Circle to Shape
		System.out.println(s1);                    // which version? //the circle version was used in s1.
		System.out.println(s1.getArea());          // which version? //circle version
		System.out.println(s1.getPerimeter());     // which version? //circle version
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		//System.out.println(s1.getRadius()); //it triggered the compilation since when you are in the shape class (superclass), 
												//you can only call the functions within that class
		   
		Circle2 c1 = (Circle2)s1;                   // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		   
		//Shape s2 = new Shape(); //cannot be instantiated because Shape is abstract
		   
		Shape2 s3 = new Rectangle2(1.0, 2.0, "RED", false);

		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		//System.out.println(s3.getLength()); //same with the s1, you can only call the methods that are in the superclass 
												//and not from the class that extends the superclass
		   
		Rectangle2 r1 = (Rectangle2)s3;   // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		   
		Shape2 s4 = new Square2(6.6);     // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		//System.out.println(s4.getSide());	//the function getSide is in the square class but not in the Shape class (superclass), 
											//that is why during compilation, it is an error
		  
		// Take note that we downcast Shape s4 to Rectangle, 
		//  which is a superclass of Square, instead of Square
		Rectangle2 r2 = (Rectangle2)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		//System.out.println(r2.getSide()); //rectangle doesn't have a method that is getSide, only the square has that function which extends the rectangle class
		System.out.println(r2.getLength());
		   
		// Downcast Rectangle r2 to Square
		Square2 sq1 = (Square2)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength()); 
		}
}