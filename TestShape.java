import java.util.*;

public class TestShape{
	
	public static void main(String[] args) {
		
	
		Shape apple = new Shape();
		Shape pineapple = new Shape("blackNwhite", false);

		System.out.println(apple.getColor());
		System.out.println(apple.isFilled());
		System.out.println(pineapple.getColor());
		System.out.println(pineapple.isFilled());
		System.out.println(apple);
		System.out.println(pineapple);
		apple.setColor("verylightpink");
		apple.setFilled(true);
		System.out.println(apple);

		Circle ci = new Circle();
		Circle rc = new Circle(3f);
		Circle le = new Circle(5f, "orangeyyy", true);

		System.out.println(ci);
		System.out.println(rc);
		System.out.println(le);

		Rectangle rec = new Rectangle();
		Rectangle tan = new Rectangle(3f, 4f);
		Rectangle gle = new Rectangle(5f, 7f, "bluish", false);

		System.out.println(rec);
		System.out.println(tan);
		System.out.println(gle);

		Square sq = new Square();
		Square ua = new Square(6f);
		Square re = new Square(7f, "violetyyy", true);

		System.out.println(sq);
		System.out.println(ua);
		System.out.println(re);
	}
}