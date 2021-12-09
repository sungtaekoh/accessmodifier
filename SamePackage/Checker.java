package org.opentutorials.javatutorials.accessmodifier.SamePackage;
import org.opentutorials.javatutorials.accessmodifier.OtherPackage.*;
	class SameClassChecker{
		public SameClassChecker() {
		//같은 클래스
		this._public();
		this._protected();
		this._default();
		this._private();
		}
	public void _public() {
		System.out.println("public");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	void _default() {
		System.out.println("default");
	}
	private void _private() {
		System.out.println("private");
	}
	}
	class SamePackageChecker extends Same {
		public SamePackageChecker() {
//			같은 패키지
			Same same = new Same();
			same._public();
			same._protected();
			same._default();
//			same._private();
			
//			같은 패키지 상속관계
			this._public();
			this._protected();
			this._default();
			//this._private();
		}
	}
	
	class OtherPackageChecker extends Other {
		public OtherPackageChecker() {
			//다른 패키지
			Other other = new Other();
			other._public();
//			other._protected();
//			other._default();
//			other._private();
			
//			다른 패키지, 서브클래스
			this._public();
			this._protected();
//			this._default();
//			this._private();
			
			Nothing nothing = new Nothing();//다른 패키지, 상속X
			other._public(); //퍼블릭은 접근가능
//			other._protected();
//			other._default();
//			other._private();
			
		}
	}
	
	
	
public class Checker {
	
}
