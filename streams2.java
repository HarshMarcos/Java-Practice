import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Main1{
    public static void main(String[]args){
    //Related to collection framework. sequence of data
    //Stream -> interface
        // List<Integer> data = Arrays.asList(1,10,2,5,8);

        // data.stream().filter(n -> n % 2 == 1).forEach(n -> System.out.println(n));

        //working on objects using stream
        //blank stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> System.out.println(e));
        String names[] = {"dasd","asdasd","dads"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e->System.out.println(e));

        Stream<Object> streamBuilder = Stream.builder().build();
        }
    }