abstract class Animal{
    public abstract void AnimalSound();
    public void sleep(){
        System.out.println("ZZZZ");
    }

}
class Pig extends Animal{
    public void AnimalSound(){
        System.out.println("Squeek!! Squeek!!");
    }
}
class Main{

    public static void main(String [ ] args)
    {
         Pig pig1 = new Pig();
         pig1.AnimalSound();
    }
}