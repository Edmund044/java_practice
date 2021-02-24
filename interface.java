interface Animal{
    public void animalSound();
    public void sleep();
}
class Pig implements Animal {
      public void animalSound(){
          System.out.println("Squeek!! Squuek!!");
      }
      public void sleep(){
          System.out.println("Zzzzz!!!");
      }
}
class Main{
    public static void main(String [ ] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

    }
}