package utility_classes;

import java.util.Optional;

public class OptionalVal {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");
        if(noVal.isPresent()){
            System.out.println(noVal.get());
        } else {
            System.out.println("No value");
        }

        if(hasVal.isPresent()){
            System.out.println(hasVal.get());
        } else {
            System.out.println("No value");
        }

        String str = noVal.orElse("Default");
        System.out.println(str);
    }
}
