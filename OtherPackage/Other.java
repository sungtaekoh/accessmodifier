package org.opentutorials.javatutorials.accessmodifier.OtherPackage;

public class Other {
	private void _private() {
		System.out.println("private");
	}
	void _default() {//�����ڸ� ������� ������ default�� �ȴ�
		System.out.println("default");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	public void _public() {
		System.out.println("public");
	}
}
