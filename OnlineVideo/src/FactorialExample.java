class FactorialExample {

	private static void factorialnumber(int number) {

		int fact = 1;

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);

	}

	public static void main(String args[]) {

		factorialnumber(10);

	}
}