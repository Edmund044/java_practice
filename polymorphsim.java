class Animal {
   public void animalSound(){
       System.out.println("Animal sound!!");
   }

}
class Dog extends Animal {
    public void animalSound(){
        System.out.println("Woof!! Woof!!");
    }
}
class Pig extends Animal {
    public void animalSound(){
        System.out.println("Squick!! Squick");
    }
}
class Main {
    public static void main (String [ ] args){
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Pig pig1 = new Pig();
         
        animal1.animalSound();
        dog1.animalSound();
        pig1.animalSound();
    }
}