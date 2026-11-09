import java.util.function.BiPredicate;

public interface BiPredicateImpl {
   public static void main(String[] args) {

        BiPredicate<String, Integer> isLonger = (str, length) -> str.length() > length;


        System.out.println(isLonger.test("Clem", 3));
        System.out.println(isLonger.test("Ade", 5));
    }
}
