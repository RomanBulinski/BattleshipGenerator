
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
