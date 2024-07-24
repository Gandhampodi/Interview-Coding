import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CollAdd {
    public static void main(String [] agr){
        List<Integer> list= Arrays.asList(1,34,45,34);

        Optional<Integer> sum=list.stream().reduce((a,b)  ->a+b);
        System.out.println("sum of numbers:"+sum.get());
        Optional<Integer> sub =list.stream().reduce((a,b) -> a-b);
        System.out.println("sub of numbers:"+sub.get());
    }

}
