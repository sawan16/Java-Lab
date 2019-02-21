
public class Square extends Shape{
	
	private Double side;
	
	public Square(Double side){
		this.side = side;
	}
	
	public String toString(){
		
		return "I am Square.";
	}

	public Double area(){
		
		return this.side * this.side;
	}
}
