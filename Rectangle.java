package Assessment;

class Rectangle {
	double length;
	double width;
	public void setRectangle(double length ,double width) {

		this.length=length;
		this.width=width;
		
	}
	public double getArea() {
		return length*width;
	}

}
class Box extends Rectangle{
	double height;
	public void setBox(double length,double width,double height) {
		this.height=height;
		setRectangle(length,width);
		
		
		
	}
	public double getVolume() {
		return length*width*height;
	}
	
}
 class Main{
	public static void main(String[] args) {
		Box b= new Box();
		b.setRectangle(8, 9);
		b.setBox(2,3,4);
		System.out.println(b.getVolume());
		System.out.println(b.getArea());
		
	}
}