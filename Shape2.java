public abstract class Shape2{
	protected String color;
	protected boolean filled;

	public Shape2(){
		color = "";
		filled = false;	
	}

	public Shape2(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public boolean isFilled(){
		return filled;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public String toString(){
		if (filled){
			return "A Shape with color of " + color + " and filled.";
		}
		return "A Shape with color of " + color + " and Not filled.";
	}
	
}