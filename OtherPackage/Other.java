package org.opentutorials.javatutorials.accessmodifier.OtherPackage;

public class Other {
	private void _private() {
		System.out.println("private");
	}
	void _default() {//접근자를 명시하지 않으면 default가 된다
		System.out.println("default");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	public void _public() {
		System.out.println("public");
	}
}
