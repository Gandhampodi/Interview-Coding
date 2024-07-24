import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;



public class Avg {
    public static void main(String agr[]) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int n = 7 ; // number of elements to skip

        List<Integer> skippedList = numbers.subList(n, numbers.size());
        System.out.println(skippedList);


    }
    }

