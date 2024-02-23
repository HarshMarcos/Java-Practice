import java.util.Arrays;
import java.util.List;

class Main2{
    public static void main(String[] args) {
        //Streams methods -> map, filter, reduce
        List<String> names = Arrays.asList("RCB", "Mi","IPL","CSK");
        List<Integer> numbers = Arrays.asList(100,2123,4324,234324,3424);
        //filter(Predicate -> Interface)
            //boolean value function
            //e->{ return true/false }
        names.stream().filter(e -> e.startsWith("R")).forEach(e->System.out.println(e));

        //map(function)
        numbers.stream().map(e -> e*e).forEach(e->System.out.println(e));

    }
}