import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class readfile{
      public static void main(){
         try{
            File obj = new File("file.txt");
            Scanner objRead = new Scanner(obj);
            while(objRead.hasNextLine()){
                System.out.println(objRead.nextLine());

            }
            objRead.close();
         }
        
         catch(FileNotFoundException e){
           System.out.println("Something went wrong!!");  
           System.out.println(e);
         }

      }



}