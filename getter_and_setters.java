public class Vehicle {
    public String color = ""; 

     public void setColor(String c){
         this.color = c;
     }
     public String getColor(){
         return color; 
     }
}

public class trial{
   public static void main(String [ ] args){
       Vehicle v1 = new Vehicle();
       v1.setColor("red");
       v1.getColor();

   }

}