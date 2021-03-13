import java.util.ArrayList;

public class lambda {
    public static void main(String [ ] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("AUDI");
        cars.forEach( (n)->{System.out.println(n);});
      // System.out.println(cars);
    }
}
