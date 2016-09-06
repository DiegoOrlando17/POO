
public class Point
{
	int point;
		
	public Point(int x)
	{
		point = x;
	}
	
	public void printPoint()
	{
		System.out.println("The point is " + point);
	}
	
	int getDistance(Point point)
	{
		return (this.point - point.point);	
	}
	public static void main(String[] args)
	{
		Point point1 = new Point(10);
		Point point2 = new Point(5);
		
		int distance = point1.getDistance(point2);
		
		System.out.println(distance);
	}

}
