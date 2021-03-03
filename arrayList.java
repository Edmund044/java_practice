import java.util.ArrayList;

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
        cars.clear();
        System.out.println(cars);
        

    }
}

