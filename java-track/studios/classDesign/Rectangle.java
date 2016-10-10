package classDesign;

public class Rectangle {
	
	private Integer length;
	private Integer width;
	private Integer area;
	private Integer perimeter;
	
	public Rectangle(Integer length, Integer width) {
		this.length = length;
		this.width = width;
		this.area = length * width;
		this.perimeter = (length * 2) + (width * 2);
	}
	
	public Integer getWidth() {
		return this.width;
	}
	
	public Integer getLength() {
		return this.length;
	}
	
	public Integer getArea() {
		return this.area;
	}
	
	public Integer getPerimeter() {
		return this.perimeter;
	}
	
	public boolean isSquare() {
		if (this.width == this.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSmaller(Rectangle other) {
		if (this.area < other.area) {
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
