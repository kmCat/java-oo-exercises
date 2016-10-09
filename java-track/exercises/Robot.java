
public class Robot {
	private String name;
	private int xPosition;
	private int yPosition;
	private int speed;
	private int orientation;
	
	public Robot(String name, int xPosition, int yPosition, int speed, int orientation)
	{
		this.name = name;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.speed = speed;
		this.orientation = orientation;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getxPosition()
	{
		return this.xPosition;
	}
	
	public int getyPosition()
	{
		return this.yPosition;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public int getOrientation()
	{
		return this.orientation;
	}
	
	public void turnRight()
	{
		if (this.orientation > 180)
		{
			this.orientation = 0;
		}
		else
		{
			this.orientation += 90;
		}
	}
	
	public void turnLeft()
	{
		if (this.orientation < 90)
		{
			this.orientation = 270;
		}
		else
		{
			this.orientation -= 90;
		}
	}
	
	public void move()
	{
		if (this.orientation == 90)
		{
			this.xPosition = this.xPosition - this.speed;
		}
		if (this.orientation == 270)
		{
			this.xPosition = this.xPosition + this.speed;
		}
		if (this.orientation == 0)
		{
			this.yPosition = this.yPosition - this.speed;
		}
		if (this.orientation == 180)
		{
			this.yPosition = this.yPosition + this.speed;
		}
	}
	
	public String toString()
	{
		return "Name: " + this.name + " Position: (" + this.xPosition + ", " + this.yPosition + ") Speed: "
				+ this.speed + " Orientation: " + this.orientation;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
