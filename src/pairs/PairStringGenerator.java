package pairs;

public class PairStringGenerator {
    private final PairString[] countryCapital = {
            new PairString("Ukraine", "Kyiv"),
            new PairString("Georgia", "Tbilisi"),
            new PairString("Poland", "Warsaw"),
            new PairString("England", "London"),
            new PairString("Czech Republic","Prague"),
            new PairString("U.S.A.", "Washington"),
            new PairString("Brazil", "Brazilia"),
            new PairString("Ireland", "Dublin"),
            new PairString("N. Ireland", "Belfast"),

    };
    private int next = 0;

    public PairString next(){
        return countryCapital[(next++)%countryCapital.length];
    }
}
