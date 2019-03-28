package old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//    Create a class that has three fields: startX, startY, length.
//    Then write a method that accepts an array of integers and returns a list of battleships.
//    The input array is structured in a following way:
//            [ [ship1_startX, ship1_startY, ship1_length], [ship2_startX, ship2_startY, ship2_length], ...]

public class Generator {


//    private static Stream<Object> flatten(Object[] array) {
//        return Arrays.stream(array).flatMap(o -> o instanceof Object[]? flatten((Object[])o): Stream.of(o));
//    }

//    public static <T> Stream<T> flattenStream(T[][] arrays) {
//        List<T> list = new ArrayList<>();
//        // Using forEach loop convert the array into stream and add the stream into list
//        for (T[] array : arrays) {
//            Arrays.stream(array)
//                    .forEach(list::add);
//        }
//        // Convert the list into Stream and return it
//        return list.stream();
//    }


//    public void generator ( Integer[][] arrOfarr ){
//
//        Stream<Integer[]> stream = Arrays.stream(arrOfarr);
//
//        stream.forEach( n -> System.out.println(n)  );
//    }


//        Integer[][] arrOfarr = { {1,2,40}, {4,5,50}, {7,8,70}};
//
//        Stream<Integer> flatenStream = flattenStream( arrOfarr );
//        flatenStream.forEach(e -> System.out.println(e));
//
//        System.out.println("-------------");

//        flattenStream( arrOfarr )
//                .filter(i -> i % 3 == 2 )
//                .forEach(e -> System.out.println(e));


        //zamiana streama na arr i przypisanie do zmiennej
//        Integer[] shortArr = flattenStream( arrOfarr )
//                .filter(i -> i % 3 == 1)
//                .toArray(Integer[]::new);
//
//        System.out.println("-------------");

//        IntStream everySecond = IntStream.range(0, shortArr.length)
//            .filter(i -> i % 2 == 1)
//            .mapToInt(i -> shortArr[i]).toArray();


        // Creating a list of Strings
//        List<String> list = Arrays.asList("Geeks", "for", "gfg",
//                "GeeksforGeeks", "GeeksQuiz");

        // Using Stream mapToInt(ToIntFunction mapper)
        // and displaying the corresponding IntStream
        // which contains length of each element in
        // given Strea
//        list.stream().mapToInt(str -> str.length()).forEach(System.out::println);
//    }


    //zamiana stream na stringa i wydukowanie
//        System.out.println(Arrays.toString(shortArr));

//        int[] flatArray2 = flatten(arrOfarr).mapToInt(Integer.class::cast).toArray();
//        IntStream flatArrayXX = Arrays.stream(flatArray2)
//                .filter(n -> n % 3 == 0);

//        int[] xxx = { 9,9,4,9,9,2,7,7,3};

//        IntStream everySecond = IntStream.range(0, xxx.length)
//                .filter(i -> i % 2 == 1)
//                .mapToInt(i -> xxx[i]).toArray();


//        Arrays.stream(shortArr)
//                .forEach(x-> {if(Arrays.stream(shortArr).anyMatch(i -> i == 3))System.out.println("jest");}  );
//
//        boolean contas = Arrays.stream(shortArr).anyMatch(x -> x == 102);
//

}
