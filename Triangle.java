public class Triangle extends Shape2{
	protected double s1;
	protected double s2;
	protected double s3;

	public Triangle(){
		s1 = s2 = s3 = 1.0;
	}
	public Triangle(double s1, double s2, double s3){
		if (s1+s2 > s3 && s1+s3 > s2 && s2+s3 > s1){
			this.s1 = s1;
			this.s2 = s2;
			this.s3 = s3;
		}
		else{
			throw new IllegalArgumentException("The following sides does not form a Triangle!");
		}
	}
	public Triangle(double s1, double s2, double s3, String color, boolean filled){
		super(color,filled);
		if (s1+s2 > s3 && s1+s3 > s2 && s2+s3 > s1){
			this.s1 = s1;
			this.s2 = s2;
			this.s3 = s3;
		}
		else{
			throw new IllegalArgumentException("The following sides does not form a Triangle!");
		}	
	}
	@Override
	public double getArea(){
        double ans = (s1 + s2 + s3) / 2;
        return Math.sqrt(ans * (ans - s1) * (ans - s2) * (ans - s3));
	}
	@Override
	public double getPerimeter(){
		return (s1+s2+s3);
	}

	@Override
	public String toString(){
		return "A Triangle with sides = " + s1 + ", " + s2 + ", " + s3 +" which is a subclass of " + super.toString();
	}
}