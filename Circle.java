
public class Circle extends Ellipse {

	int radius;
	double pi = 3.14;
	
	public Circle(int r)
	{
		radius = r;
	}
	
	double getPerimeter()
	{
		return (2*pi*this.radius);
	}
	
	double getArea()
	{
		return (pi*this.radius*this.radius);
	}
}
