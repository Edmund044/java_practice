import java.util.ArrayList;
import java.util.Collections;

class List{
    public static void main (String [] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("MISTUBISHI");
        cars.add("TOYOTA");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(0,"Lamborghini");
        System.out.println(cars.get(0));
        cars.remove(0);
        System.out.println(cars);
        cars.set(0,"Ferrari");
        System.out.println(cars);
        System.out.println(cars.size());
        cars.add("MCLAREN");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars);
       int i;
       
       for(i=0;i<cars.size();i++){
           System.out.println(cars.get(i));
       }
       System.out.println("Part 2");
        Collections.sort(cars);
        for(i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        /* for(int i : cars){
            System.out.println(cars.get(i));
        }*/

    }
}

