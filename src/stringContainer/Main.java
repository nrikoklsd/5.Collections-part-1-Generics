package stringContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        long begin = System.currentTimeMillis();
        Stream.generate(UUID::randomUUID).limit(5000).forEach(i -> list.add(i.toString()));
        System.out.println("ArrayList time: " + (System.currentTimeMillis() - begin) + " ms");
        System.out.println("Size of ArrayList: " + list.size());

        StringContainer customStringContainer = new StringContainer();
        begin = System.currentTimeMillis();
        Stream.generate(UUID::randomUUID).limit(5000).forEach(i -> customStringContainer.add(i.toString()));
        System.out.println("NazarSenykStringContainer time: " + (System.currentTimeMillis() - begin) + " ms");
        System.out.println("Size of NazarSenykStringContainer: " + customStringContainer.size());
}
}
