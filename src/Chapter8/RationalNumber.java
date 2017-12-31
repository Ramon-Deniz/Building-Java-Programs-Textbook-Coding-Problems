package Chapter8;

public class RationalNumber {
	/**
	 * Constructor
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public RationalNumber(int numerator, int denominator) {
		if (denominator == 0)
			throw new IllegalArgumentException();
		this.numerator = numerator;
		this.denominator = denominator;
		simplifyNegatives();
		simplify();
	}

	public RationalNumber() {
		denominator = 1;
	}

	/**
	 * Adds to current rational number.
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public void add(int numerator, int denominator) {
		if (this.denominator == denominator) {
			this.numerator += numerator;
		} else {
			this.numerator *= denominator;
			this.numerator += (numerator * this.denominator);
			this.denominator *= denominator;
		}
		simplifyNegatives();
		simplify();
	}

	/**
	 * Subtracts from current rational number.
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public void subtract(int numerator, int denominator) {
		add(numerator *= -1, denominator);
	}

	/**
	 * Multiplies current rational number.
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public void multiply(int numerator, int denominator) {
		this.numerator *= numerator;
		this.denominator *= denominator;
	}

	/**
	 * Divides current rational number.
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public void divide(int numerator, int denominator) {
		multiply(denominator, numerator);
	}

	/**
	 * Get the denominator of the rational number.
	 * 
	 * @return int
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Get the numerator of the rational number.
	 * 
	 * @return int
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Converts rational number to String.
	 */
	public String toString() {
		if (denominator == 1)
			return "" + numerator;
		else if (numerator == 0)
			return "0";
		return "" + numerator + "/" + denominator;
	}

	/**
	 * Simplifies rational number.
	 */
	private static void simplify() {
		boolean isNegative = (numerator < 0);
		if (isNegative)
			numerator *= -1;
		if (numerator < denominator) {
			for (int i = numerator; i > 1; i--)
				if (numerator % i == 0 && denominator % i == 0) {
					numerator /= i;
					denominator /= i;
					i = numerator;
				}
		} else {
			for (int j = denominator; j > 1; j--)
				if (numerator % j == 0 && denominator % j == 0) {
					numerator /= j;
					denominator /= j;
					j = denominator;
				}
		}

		if (isNegative)
			numerator *= -1;

	}

	/**
	 * Removes unnecessary negative symbols.
	 */
	private static void simplifyNegatives() {
		if (numerator < 0 && denominator < 0) {
			numerator *= -1;
			denominator *= -1;
		}

		else if (numerator > 0 && denominator < 0) {
			numerator *= -1;
			denominator *= -1;
		}
	}

	private static int numerator;
	private static int denominator;

}
