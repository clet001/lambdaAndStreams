import java.util.function.BinaryOperator;

public interface BinaryOperatorImpl {
   public static void main(String[] args) {

        BinaryOperator<Integer> max = (number1, number2) -> (number1 > number2) ? number1 : number2;


        System.out.println(max.apply(50, 100));
    }
}
