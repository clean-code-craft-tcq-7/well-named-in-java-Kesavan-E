package colorcoder;
public class ColorPair {
        private MajorColor majorColor;
        private MinorColor minorColor;
        
        public ColorPair(MajorColor major, MinorColor minor)
        {
            majorColor = major;
            minorColor = minor;
        }
        public MajorColor getMajor() {
            return majorColor;
        }
        public MinorColor getMinor() {
            return minorColor;
        }
        String ToString() {
            String colorPairStr = Main.MajorColorNames[majorColor.getIndex()];
            colorPairStr += " ";
            colorPairStr += Main.MinorColorNames[minorColor.getIndex()];
            return colorPairStr;
        }
    };
