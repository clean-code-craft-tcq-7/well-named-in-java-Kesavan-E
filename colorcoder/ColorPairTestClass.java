package colorcoder;

public class ColorPairTestClass {
	
	private ColorPairTestClass() {
	}

	static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = ColorPairImpl.getColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.toString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		int pairNumber = ColorPairImpl.getPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}
}
