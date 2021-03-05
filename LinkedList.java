import java.util.LinkedList;
class list{
    public static void main (String [ ] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("VOLVO");
        cars.add("BMW");
        cars.add("MERCEDES");
        cars.add("AUDI");
        System.out.println(cars);
        System.out.println(cars.get(0));

    }
}