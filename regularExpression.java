import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regularExpression {
    public static void main (String [ ] args){
      Pattern pattern = Pattern.compile("W3SCHOOLS");
      Matcher matcher = pattern.matcher("W3SCHOOLS IS GREAT");
      boolean matchfound = matcher.find();
      if(matchfound){
           System.out.println("THERE IS A MATCH");

      }
      else{
          System.out.println("THERE IS NO MATCH");
      }


    }
    

}
