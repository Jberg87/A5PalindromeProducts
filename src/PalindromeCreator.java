public class PalindromeCreator {

	public void longestFind(int multiplierNumbers) {

		int palindromeMax = 0;
		int iMax = 0;
		int jMax = 0;
		MaxMultiplierNumCreator mmnc = new MaxMultiplierNumCreator();
		int maxMulitplierNum  = mmnc.maxMultiplierNumCreator(multiplierNumbers);
		
		for (int i = maxMulitplierNum; i >= 0; i--) {
			for (int j = maxMulitplierNum; j >= 0; j--) {
				int tempMultiplied = i * j;
				String tempMultipliedString = Integer.toString(tempMultiplied);
				String tempMultipliedStringReversed = new StringBuilder(tempMultipliedString).reverse().toString();
				if (tempMultipliedString.equals(tempMultipliedStringReversed)) {
					if (tempMultiplied > palindromeMax) {
						palindromeMax = tempMultiplied;
						iMax = i;
						jMax = j;
					}
				}
			}
		}System.out.println("The highest Palindrome number is " + iMax
					+ " x " + jMax + " = " + palindromeMax);
	}
}
