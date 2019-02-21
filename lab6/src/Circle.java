import java.math.*;
public class Circle extends Shape {
	private Double radius;
	
	public Circle(Double radius){
		this.radius = radius;
	}
	public Double area(){
		return this.radius * this.radius * Math.PI;
	}

}
