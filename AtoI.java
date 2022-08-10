
// Java program for
// implementation of atoi
class AtoI {

	// A simple atoi() function
	static int myAtoi(char[] str) {

		// Initialize result
		int res = 0;

		// Initialize sign as positive
		int sign = 1;

		// Initialize index of first digit
		int i = 0;

		// If number is negative, then
		// update sign
		if (str[0] == '-') {
			sign = -1;

			// Also update index of first
			// digit
			i++;
		}

		// Iterate through all digits
		// and update the result
		int asci0 = '0';
		System.out.println("ASCII value of  '0'  is : " + asci0);
		for (; i < str.length; ++i) {
			int ascii = str[i];
			System.out.println("ASCII value of " + str[i] + "is : " + ascii);
			res = res * 10 + str[i] - '0';
		}

		// Return result with sign
		// handle max and min
		if (res > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		if (res < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		return sign * res;
	}

	// Driver code
	public static void main(String[] args) {
		String str = "-12 3";
		char[] charArray = str.replaceAll("\\s+", "").toCharArray();

		// Function call
		int val = myAtoi(charArray);
		System.out.println(val);
	}
}

// This code is contributed by 29AjayKumar
