package day21;
//추상클래스 기본. 
public class Borad {
	public static void main(String[] args) {
		new Rect().draw(10, 50);
		new Tri().draw(30, 5.6);
		
		Shape.function();
	}

}
