
public class Rectangle extends Figure
{
	int base, height;
	
	public Rectangle (int x, int y)
	{
		base = x;
		height = y;
	}
	
	int getPerimeter ()
	{
		return (2*this.base + 2*this.height);
	}
	
	int getArea ()
	{
		return (this.base*this.height);
	}
	
	double getDiagonal ()
	{
		return (Math.sqrt(this.base*this.base + this.height*this.height));
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
