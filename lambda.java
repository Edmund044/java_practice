import java.util.ArrayList;
import java.util.function.Consumer;

public class lambda {
    public static void main(String [ ] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("AUDI");
        Consumer<String> number = (n) -> { System.out.println(n);};
        cars.forEach(number);
      // System.out.println(cars);
    }
}
