class A {
	public void show() {
		System.out.println("in A show");
	}

	public void config() {
		System.out.println("in A config");
	}

	public int add(int a, int b) {
		return a + b;
	}
}

class B extends A {
	public void show() {
		System.out.println("in B show");
	}

	public int add(int a, int b) {
		return a + b + 2;
	}
}


class Overriding {
	public static void main(String[] s) {
		B obj = new B();
		obj.show();
		obj.config();
		
		int r1 = obj.add(2, 3);
		System.out.println(r1);
	}
}