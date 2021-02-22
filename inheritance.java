class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Beep!! Beep!!");
    }
}

class Car extends Vehicle {
   private String model = "Mustang";
   public static void main(String [ ] args){
       Car myCar = new Car();

       myCar.honk();
       System.out.println("Brand name is:"+ myCar.brand);
       System.out.println("Model name is:"+ myCar.model);

   }

}