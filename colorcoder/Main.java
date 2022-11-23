package colorcoder;

public class Main {
    final static String MajorColorNames[] = {"White", "Red", "Black", "Yellow", "Violet"};
    final static int numberOfMajorColors = MajorColorNames.length;
    final static String MinorColorNames[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
    final static int numberOfMinorColors = MinorColorNames.length;

    public static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
        MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
   public static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }

    static void printManual() {
        int count = 1;
        for(int i = 0 ; i< numberOfMajorColors ; i++) {
            for(int j = 0; j< numberOfMinorColors ; j++) {
                 System.out.println(count + " | " + MajorColorNames[i] + " | " + MinorColorNames[j]);
                 count++;
            }
        }
   } 

    public static void main(String[] args) {
        printManual();
    }
}
