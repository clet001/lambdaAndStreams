import java.util.function.Function;

public interface FunctionImpl {
    public static void main(String[] args) {

        Function<Integer, Integer> squareFunction = (number) -> number * number;


        System.out.println(squareFunction.apply(5));
    }
}
