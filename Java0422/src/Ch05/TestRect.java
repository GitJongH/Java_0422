package Ch05;
// ppt 36p 상속, 오버라이딩 실습1
class Rect {
	private int width, height;
	
	public Rect() {
		this.width = this.height = 1;
	}
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int setWidth(int width) {
		return this.width = width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int setHeight(int height) {
		return this.height = height;
	}
	
	public int area() {
		return this.width * this.height;
	}
	
	public int around() {
        return 2 * (this.width + this.height);
    }
}

class Vol extends Rect {
	private int depth;
	
	public Vol() {
		super();
		this.depth = 1;
	}
	
	public Vol(int width, int height, int depth) {
		super(width, height);
		this.depth = depth;
	}
	
	public int getDepth() {
		return this.depth;
	}
	
	public void setDepth(int depth) {
        this.depth = depth;
    }
	
	public int volume() {
		return super.area() * this.depth;
	}
	
	public int around() {
		return (super.around() * 2 + depth * 4);
	}	
}

public class TestRect { // 김종현
	public static void main(String[] args) {
		Rect r = new Rect();
		Vol v = new Vol(2, 2, 2);
		
		System.out.println("가로:" + r.getWidth() + ",높이:" + r.getHeight());
		System.out.println("깊이:" + v.getDepth() + ",부피:" + v.volume());
		System.out.println("사각형둘레:" + r.around() + ",직육면체둘레:" + v.around());
	}
}
