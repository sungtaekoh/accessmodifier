package org.opentutorials.javatutorials.accessmodifier;
/*
 * private�� ����ϴ� ����
 * ����ϱ⸦ ���ϴ� �ǵ���θ� ����ϰ� �ϱ� ���Ͽ� ������ �α� ���� ����Ѵ�
 */
	class Calculator{
		private int left, right;
		
		public void setOprands(int left, int right) {
			this.left = left;
			this.right = right;
		}
		private int _sum() {
			return this.left+this.right;
		}
		public void sumDecoplus() {
			System.out.println("+++"+_sum()+"++++");
		}
		public void sumDecoMinus() {
			System.out.println("------"+_sum()+"----");
		}
	}
public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sumDecoplus();
		c1.sumDecoMinus();
	}

}
