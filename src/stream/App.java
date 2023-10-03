package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        // Döngü
        Stream.of("Farid", "İqbal", "Shahriyar")
                .forEach(System.out::println);
        // Mapleme
        Stream
                .of("Farid", "İqbal", "Shahriyar")
                .map(String::toUpperCase)
                .forEach(System.out::println);
        // Filtreleme
        Stream
                .of("Farid", "İqbal", "Shahriyar")
                .filter(p -> p.startsWith("Y"))
                .forEach(System.out::println);
        // IntStream
        IntStream
                .range(0, 10)
                .filter(p -> p % 2 == 0)
                .forEach(System.out::println);
    }
}
