public class Driver {

	public static void main(String[] args) {
		Rational a = new Rational(1, 2);
		Rational b = new Rational(3, 4);
		Rational c = new Rational(3, 6);
		String deez = new String("4, 6");

		System.out.println("1/2 = 3/6? " + a.equals(c));
		System.out.println("1/2 v 3/6: " + a.compareTo(c));
		System.out.println("1/2 = 3/4? " + a.equals(b));
		System.out.println("1/2 v 3/4: " + a.compareTo(b));
		System.out.println("1/2 = '4, 6'? " + a.equals(deez));
		System.out.println("1/2 vs '4, 6': " + a.compareTo(deez));
	}

}
