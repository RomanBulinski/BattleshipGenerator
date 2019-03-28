import java.util.stream.Stream;

public class Example {


//    Integer[][] arrOfarr = { {1,2,40}, {4,5,50}, {7,8,70}};
//
//    Stream<Integer> flatenStream = Generator.flattenStream( arrOfarr );
//        flatenStream.forEach(e -> System.out.println(e));
//
//        System.out.println("-------------");
//
//    flattenStream( arrOfarr )
//                .filter(i -> i % 3 == 2 )
//            .forEach(e -> System.out.println(e));
//
//
//    //zamiana streama na arr i przypisanie do zmiennej
//    Integer[] shortArr = flattenStream( arrOfarr )
//            .filter(i -> i % 3 == 1)
//            .toArray(Integer[]::new);
//
//        System.out.println("-------------");




    //        IntStream stream = Arrays
//                .stream(intdates)
//                .flatMapToInt(Arrays::stream);

//        List<String> list = Arrays.asList("Anne", "Bill", "Chris", "Dean", "Eve", "Fred", "George");
//        return IntStream.range(0, list.size())
//                .filter(n -> n % 3 == 0)
//                .mapToObj(list::get)
//                .collect(Collectors.toList());



//    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//    int skip = 3;
//    int size = list.size();
//    // Limit to carefully avoid IndexOutOfBoundsException
//    int limit = size / skip + Math.min(size % skip, 1);
//
//    List<Integer> result = Stream.iterate(0, i -> i + skip)
//            .limit(limit)
//            .map(list::get)
//            .collect(Collectors.toList());
//
//    System.out.println(result); // [1, 4, 7, 10]


//         System.out.println(
//                 Seq.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//                 .zipWithIndex()             // This produces a Tuple2(yourvalue, index)
//                        .filter(t -> t.v2 % 2 == 0) // Filter by the index
//            .map(t -> t.v1)             // Remove the index again
//            .toList()
//        );


//    int[] simpleArray = { 1,2,3};
//    IntStream arraysStream = Arrays.stream(simpleArray);
//        arraysStream.forEach(System.out::println);
//
//
//    int arr[] = { 1, 2, 3, 4, 5 };
//    IntStream stream = Arrays.stream(arr, 1, 3);
//        stream.forEach(str -> System.out.print(str + " "));

//            Arrays.stream(intdate)
//            .asDoubleStream()
//
//                .forEach(e->System.out.print(e + " "));

}
