package Ch05;
// ppt 30p [예제] 메소드 오버라이딩 다향성 실현
class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect2 extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle2 extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	public static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line();
		paint(line);
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect2());
		paint(new Circle2());
	}

}
