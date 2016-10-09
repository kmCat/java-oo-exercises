
public class Rectangle {
	
	private Integer length;
	private Integer width;
	
	public Rectangle(Integer length, Integer width) {
		this.length = length;
		this.width = width;
	}
	
	public Integer getWidth() {
		return this.width;
	}
	
	public Integer getLength() {
		return this.length;
	}
	
	public static Integer area() {
		return (this.width * this.length);
	}
	
	public Integer perimeter() {
		return (this.width * 2) + (this.length * 2);
	}
	
	public boolean isSquare(Rectangle other) {
		if (this.width == other.width && this.length == other.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSmaller(Rectangle other) {
		if (Rectangle.area() < other.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
