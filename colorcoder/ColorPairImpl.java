package colorcoder;

public class ColorPairImpl {

	private ColorPairImpl() {
		
	}
	
	public static ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / Main.NUMBEROFMINORCOLORS);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % Main.NUMBEROFMINORCOLORS);
		return new ColorPair(majorColor, minorColor);
	}

	public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * Main.NUMBEROFMINORCOLORS + minor.getIndex() + 1;
	} 
}
