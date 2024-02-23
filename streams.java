import java.util.Arrays;
import java.util.List;


class Main{
public static void main(String[]args){
        List<Integer> nums = Arrays.asList(4,5,6,7,8);

        // Stream<Integer> data = nums.stream();
        nums.stream()
            .filter(n -> n % 2 == 0)
            .sorted()
            .map(n -> n*2)
            .forEach(n -> System.out.println(n));
        // long count = data.count();
        // System.out.println(count);
        // data.forEach(n -> System.out.println(n));
        // Stream<Integer> mappedData = data.map(n -> n*2);
        // mappedData.forEach(n -> System.out.println(n));


    }
}