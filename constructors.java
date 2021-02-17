public class Vehicle1 {
    private String color = "";
    Vehicle1(){
        color = "red";
    }
    
}
public class Vehicle2 {
    private String color = "";
    Vehicle2(String c){
        color = c;
    }

}
public class myClass{
    public static void main(String [ ] args){
        Vehicle1 v1 = new Vehicle1();
        Vehicle2 v2 = new Vehicle2("pink");


    }
}