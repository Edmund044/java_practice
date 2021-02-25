import org.graalvm.compiler.core.phases.LowTier;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}
public class Main{
    public static void main (String [ ] args){
      Level myVar = Level.MEDIUM;
      System.out.println(myVar);

      switch(myVar){
          case LOW:
           System.out.println(myVar);
          break; 
          case MEDIUM:
           System.out.println(myVar);
          break;
          case  HIGH:
           System.out.println(myVar);
          break;
          default:
            System.out.println("Invalid choice!!");  

      }

    }

}
