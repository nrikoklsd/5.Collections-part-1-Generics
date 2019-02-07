package pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demonstrate {
    void demo(int size){
        PairStringGenerator tupleStringGenerator1 = new PairStringGenerator();
        PairStringGenerator tupleStringGenerator2= new PairStringGenerator();

        PairString[] tupleStrings1 = new PairString[size];
        List<PairString> tupleStrings2 = new ArrayList<>(size);
        for(int i = 0; i < size; i++){
            tupleStrings1[i] = tupleStringGenerator1.next();
            tupleStrings2.add(tupleStringGenerator2.next());
        }
        Arrays.sort(tupleStrings1);
        System.out.println("Array CompareTo " +Arrays.toString(tupleStrings1));
        tupleStrings2.sort(PairString::compareTo);
        System.out.println("ArrayList CompareTo " + tupleStrings2);
        Arrays.sort(tupleStrings1,new SecondStringComparator());
        System.out.println("Array Comparator " + Arrays.toString(tupleStrings1));
        tupleStrings2.sort(new SecondStringComparator());
        System.out.println("ArrayList Comparator " + tupleStrings2);
        System.out.println("Array Search " + Arrays.binarySearch(tupleStrings1, 0,tupleStrings1.length,
                new PairString("Ukraine","Kyiv"),new SecondStringComparator() ));
        System.out.println("ArraysList Search " + Collections.binarySearch(tupleStrings2, new PairString("Ukraine","Kyiv"),
                new SecondStringComparator()));
    }
    public static void main(String[] args) {
        new Demonstrate().demo(7);
    }
}
