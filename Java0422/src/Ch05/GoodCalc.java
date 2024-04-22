package Ch05;

abstract class Calc {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a); 
}
//추상 메소드 구현 방법
// 우측 상단에 source 메뉴에서 Override/implment Method... 선택
public class GoodCalc extends Calc{	
	@Override // 추상 메소드 구현
	public int add(int a, int b) {
		return a + b;
	}

	@Override // 추상 메소드 구현
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override // 추상 메소드 구현
	public double average(int[] a) {
		double sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return (sum / a.length);
	}

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int [] {2, 3, 4}));
	}

}
