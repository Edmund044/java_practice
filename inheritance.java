public class Vehicle {
 protected String brand = "Ford";

 public void honk(){
     System.out.println("Beep! Beep!");
 }

}

public class car extends Vehicle{
    private String model = "Mustang"; 
    public static void main(String [ ] aargs){
      car car1 = new car();
      car1.honk();
      System.out.println("Brand name is"+ car1.brand);
      System.out.println("Model type is"+ car1.model);
  }

     
}