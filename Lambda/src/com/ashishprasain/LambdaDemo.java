package com.ashishprasain;

public class LambdaDemo {
	public static void main(String[] args) {
		A a;
		a = () -> System.out.println("Hello Lambda Expression");
		a.show();
	}

}
interface A {
	public void show();
}

//class Xyz implements A {
//	public void show() {
//		System.out.println("Lamnda Expression Demo");
//	}
//}
