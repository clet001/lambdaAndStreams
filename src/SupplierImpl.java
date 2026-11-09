import java.security.SecureRandom;
import java.util.Random;
import java.util.function.Supplier;

import static java.util.stream.Stream.generate;

public interface SupplierImpl {
    public static void main (String[] args){
        Supplier<Integer> integerSupplier = () ->
                new SecureRandom().nextInt(1, 5);

        generate(integerSupplier)
                .forEach((number)-> System.out.println(number));

    }
}
