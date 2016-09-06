
public class Triangle extends Figure
{
	int base, height;
	
	public Triangle (int x, int y)
	{
		base = x;
		height = y;
	}
	
	double getPerimeter ()
	{
		return (this.base + this.height + Math.sqrt(this.base*this.base + this.height*this.height));
	}
	
	double getArea ()
	{
		return ((this.base*this.height)/2);
	}
	
	int getBase ()
	{
		return this.base;
	}
	
	int getHeight ()
	{
		return this.height;
	}
}
