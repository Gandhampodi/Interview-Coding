import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Colle {
    public static void main(String [] agr){

        List<String> items = Arrays.asList("a", "b", "c", "d", "e", "f");

        // Skip the first 3 elements
        List<String> result = items.stream()
                .skip(1)
                .limit(4)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}



