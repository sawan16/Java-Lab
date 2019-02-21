import java.util.*;
public class ShapeCollection {

	private List<Shape> shapes;
	
	public void displayShapes(){
		System.out.println(shapes);
	}
	
	public static void main(String [] args){
		
		ShapeCollection sc = new ShapeCollection();
		
		sc.shapes = new ArrayList<Shape>();
		
		sc.shapes.add(new Circle(4.4));
		sc.shapes.add(new Circle(8.4));
		sc.shapes.add(new Square(8.0));
		sc.shapes.add(new Rectangle(3.0,9.0));
		sc.displayShapes();
	}
}
