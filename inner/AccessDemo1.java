package org.opentutorials.javatutorials.accessmodifier.inner;
	
	class A {
		public String y() {
			return "public void y()";
		}//public 누구라도 사용 가능
		private String z() {
			return "public void z()";
		}//private은 외부의 클래스에선는 사용이 불가능하다
		public String x() {
			return z();
		}//x를통해서 z를 사용가능하다
	}
public class AccessDemo1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
//		아래 코드는 오류가 발생한다.
//		System.out.println(a.z());
		System.out.println(a.x());
		
	}

}
