
public class Box {

private static double length;
private static double breadth;
private static double height;


// I want to create a Box
public Box(double length, double breadth, double height)
{
	this.length = length;
	this.breadth = breadth;
	this.height = height;
}

// construtor overloading
public Box(double side)
{
	this.length = side;
	this.breadth = side;
	this.height = side;
}

public double getLength()
{
	return this.length;
}

public double getBreadth()
{
	return this.breadth;
}

public double getHeight()
{
	return this.height;
}


public void setLength( double newLength)
{
	this.length = newLength;
}

public void setBreadth( double newBreadth)
{
	this.breadth = newBreadth;
}

public double getVolume()
{
	return this.length * this.breadth * this.height;
}

public static double getVolume(double length, double breadth, double height)
{
	return length * breadth * height;
}

public static void main(String[] args)
{
	Box firstBox = new Box( 10,15,20);
	System.out.println(firstBox.getLength());
	System.out.println(firstBox.getVolume());
	System.out.println(getVolume(10,20,25));
	
	firstBox.setLength(1235);
	
	System.out.println(firstBox.getLength());
}
}
