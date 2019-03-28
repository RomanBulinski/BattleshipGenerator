import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//    Create a class that has three fields: startX, startY, length.
//    Then write a method that accepts an array of integers and returns a list of battleships.
//    The input array is structured in a following way:
//            [ [ship1_startX, ship1_startY, ship1_length], [ship2_startX, ship2_startY, ship2_length], ...]

public class Generator {


    public static List<Ship>generator ( Integer[][] arrOfarr ){

        List<Ship> ships = new ArrayList<>();
        Stream<Integer[]> stream = Arrays.stream(arrOfarr);
        stream.forEach( n -> ships.add(new Ship(n[0],n[1],n[2] ) ));
        return ships;
    }


    public static void main(String[] args) {

        Integer[][] arrOfarr = { {0,0,4}, {4,4,3}, {7,7,1}};
        List<Ship> ships = generator(arrOfarr);

        for ( Ship s : ships ){
            System.out.println("x : "+s.getStartX());
            System.out.println("y : "+s.getStartY());
            System.out.println("length : "+s.getLength());
            System.out.println("------------");
        }

    }

}
