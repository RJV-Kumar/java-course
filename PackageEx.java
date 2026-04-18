//import other.Apple;
import other.*;

import other.tools.*;

class PackageEx {
	public PackageEx() {
		System.out.println("in packages");
	}

	public static void main(String[] s) {
		Apple obj = new Apple();

		Banana obj2 = new Banana();
		Cat obj3 = new Cat();

		System.out.println("in packages");
	}
}