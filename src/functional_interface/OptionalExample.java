package functional_interface;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        System.out.println(optional.get());

    }
}
