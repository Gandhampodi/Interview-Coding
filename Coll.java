import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Coll {
    public static void main(String agr[]) {
        // Integer [] arr=new Integer[]{1,2,3,4,5,6,7,8,9};
        //  ArrayList <Integer> arraylist=new ArrayList<>(Arrays.asList(arr));
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            if (i < 900 || i > 1000) { // Skip numbers from 900 to 1000
                numbers.add(i);


            }
            numbers.stream();
            numbers.forEach(System.out::println);
      /*  List<Integer> numbers1 = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {

            numbers.add(i);
        }
        for (int number : numbers1) {
            System.out.println(number);
        }
*/
        }
    }
    }

