package org.opentutorials.javatutorials.accessmodifier.inner;
	
	class A {
		public String y() {
			return "public void y()";
		}//public ������ ��� ����
		private String z() {
			return "public void z()";
		}//private�� �ܺ��� Ŭ���������� ����� �Ұ����ϴ�
		public String x() {
			return z();
		}//x�����ؼ� z�� ��밡���ϴ�
	}
public class AccessDemo1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
//		�Ʒ� �ڵ�� ������ �߻��Ѵ�.
//		System.out.println(a.z());
		System.out.println(a.x());
		
	}

}
