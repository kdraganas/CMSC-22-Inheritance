public class Square2 extends Rectangle2{
	
	public Square2(){
	}

	public Square2(double side) {
   		super(side, side); 
	}
	public Square2(double side, String color, boolean filled){
		super(side, side, color, filled);
	}
	public double getSide(){
		return super.getWidth();
	}
	public void setSide(double side){
		setWidth(side);
		setLength(side);
	}
	public void setWidth(double side){
		super.setWidth(side);
	}
	public void setLength(double side){
		super.setLength(side);
	}
	@Override
	public String toString(){
		return "A square with side = " + getSide() + " which is a subclass of " + super.toString();
	}		

}
