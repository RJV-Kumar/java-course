class A {
	A() {
		System.out.println("in default A");
	}

	public A(int n) {
		System.out.println("in paramaterised A");
	}
}

class B extends A {
	public B () {
		super(5);
		System.out.println("in defualt B");
	}

	public B(int a) {
		//super(a);
		this();
		System.out.println("in paramaterised B");
	}
}

class ThisAndSuper {
	public static void main(String[] str) {
		//B obj = new B();
		B obj = new B(5);
	}
}