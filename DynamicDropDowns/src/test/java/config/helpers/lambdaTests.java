package config.helpers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class lambdaTests {
    public static void main(String[] args) {
        /*new Thread(() -> {
            System.out.println("WATEK");
            System.out.println("asdasdasdasdasd");
        }
        ).start();*/

        List<Integer> mojList = Arrays.asList(5, 3, 4, 2, 12, 0);

        int wynik = mojList.stream().filter((wieksze) -> {
            return wieksze >= 5;
        }).mapToInt((i) -> {
            return i;
        }).sum(); //jak jeden argument to nawiasy (wieksze) sa niepotrzebne i jak jednak linia body to uszy tez niepotrzebne

        int wynik2 = mojList.stream().mapToInt(i -> i).sum(); // other option line from above
        System.out.println(wynik2);

        System.out.println(mojList);

        Collections.sort(mojList, (o1, o2) ->{ return o1.compareTo(o2);});
        System.out.println(mojList);
    }
}

class mnoznik implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer * integer;
    }

    class sortownik implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }

    //FUNCTIONAL INTERFACE - 4 króli

//     1. function || R apply(T t);
//     2. Consumer || void accept(T t);
//     3. Supplier || T get();
//     4. Predicate || boolean test(T t);
//
//
//     TODO:
//    Stream vs Collections implementation
//    practice at home Streams&Lambdas
//    summ all items in list using streams
//    potega liczb na ArrayLiscie

}
