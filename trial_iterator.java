import java.util.ArrayList;
import java.util.Iterator;

public class trial_iterator {
    public static void main (String [ ] args){
       ArrayList<String> cars = new ArrayList<String>();
       cars.add("VOLVO");
       cars.add("MERCEDES");
       cars.add("BMW");
       cars.add("AUDI");
       Iterator<String> it = cars.iterator();
       while(it.hasNext()){
           System.out.println(it.next());

       }

    }    

}
