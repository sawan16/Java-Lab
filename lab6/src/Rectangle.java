
public class Rectangle extends Shape{
	private Double length;
	private Double width;
	
	public Rectangle(Double length,Double width){
		this.length = length;
		this.width = width;
	}
	
	public String toString(){
		return "I am Rectangle.";
	}

	public Double area(){
		
		return this.length * this.width;
	}
}
