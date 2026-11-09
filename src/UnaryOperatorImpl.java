import java.util.function.UnaryOperator;

public interface UnaryOperatorImpl {
    public static void main(String [] args) {

        UnaryOperator<Integer> add = (number) -> number + 2;


        System.out.println(add.apply(10));
    }
}
