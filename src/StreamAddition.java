import java.util.stream.Stream;

public class StreamAddition {

    public static void main(String[] args) {
        System.out.println("Welcome to streams");

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        int sum = integerStream.filter(i -> i > 2).mapToInt(i -> i).sum();
        System.out.printf("Sum is : " + sum);
    }
}
