package pairs;

import java.util.Comparator;

public class SecondStringComparator implements Comparator<PairString> {
    @Override
    public int compare(PairString o1, PairString o2) {
        return o1.getS2().compareTo(o2.getS2());
    }
}
