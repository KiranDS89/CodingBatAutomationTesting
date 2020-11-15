
public class CodingBatLib {

	public static boolean sleepIn(boolean weekday, boolean vacation) {

		if (!weekday || vacation) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		if (aSmile && bSmile || !aSmile && !bSmile) {
			return true;
		} else {
			return false;
		}

	}

	public static int sumDouble(int a, int b) {

		if (a == b) {
			return 4 * a;
		} else {
			return a + b;

		}
	}

	public static int diff21(int n) {

		if (n > 21) {
			return 2 * Math.abs(n - 21);
		} else {
			return Math.abs(n - 21);
		}
	}

	// practice again ==
	public static boolean parrotTrouble(boolean isTalking, int hour) {

		if (isTalking == true && (hour < 7 || hour > 20)) {
			return true;
		} else {
			return false;
		}
	}

	// repeat problem again
	public static boolean makes10(int a, int b) {
		if (a == 10 || b == 10 || (a + b) == 10) {
			return true;
		} else {
			return false;
		}
	}
	// repeat following problem again

	public static boolean nearHundred(int a) {

		return Math.abs(a - 100) <= 10 || Math.abs(a - 200) <= 10;

	}

	public static boolean posNeg(int a, int b, boolean negative) {

		if (negative) {
			if (a < 0 && b < 0)
				return true;
			else
				return false;

		} else {
			if ((a > 0 && b < 0) || (a < 0 && b > 0))
				return true;
			else
				return false;
		}
	}

	// repeat this problem "not "
	public static String notString(String str) {

		if (str.length() < 3) {
			return "not " + str;
		} else if (str.substring(0, 3).equals("not")) {
			return str;
		} else {
			return "not " + str;
		}
	}

	public static boolean stringE(String str) {

//		for ( char ch : str.toCharArray() ) {
//	    	System.out.println(ch);
//	    }
//	    
		int x = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e')
				x++;
		}
		return (x >= 1 && x <= 3);
	}

	public static String extraEnd(String str) {

		int n = str.length();
		String x = str.substring(n - 2, n);
		return x + x + x;
	}

	public static String firstTwo(String str) {

		if (str.length() <= 2) {
			return str;
		} else {
			String x = str.substring(0, 2);
			return x;
		}
	}
}
