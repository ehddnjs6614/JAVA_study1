package Ph;

public class OutClass {
 int outData ;
 
 public OutClass() {
	 
	 System.out.println("외부 클래스 생성자 호출");
}
 
 public void showOuter() {

	 System.out.println("외부 클래스의 메서드 호출됨");
 }
 
 public class InnerClass{
	 int inData;
	 
	 public InnerClass() {

	 System.out.println("내부클래스 생성자 호출됨");
	 }
	 public void showInner() {
		 outData = 20;
		 System.out.println("내부 클래스의 메서드 호출 됨");
		 System.out.println("outdata :" + outData );
		 showOuter();
		 
	 }
	 
	
	 
	 
 }
 public static void main(String[] args) {
	OutClass out = new OutClass();
	OutClass.InnerClass in = out.new InnerClass();
	in.showInner();
 }
 
 
}

