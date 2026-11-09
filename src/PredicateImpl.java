import java.util.function.Predicate;

public interface PredicateImpl {
    public static void main(String[] args) {

        Predicate<Integer> isEven = (number) -> number % 2 == 0;


        System.out.println(isEven.test(8));
        System.out.println(isEven.test(5));
    }
}
