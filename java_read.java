import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class readFile {
    public static void main(String [ ] args){
        try{
           File obj = new File("file.txt");
           Scanner objRead = new Scanner(obj);
           while(objRead.hasNext()){
               System.out.println(objRead.nextLine());

           }
           objRead.close();


        }
        catch(FileNotFoundException e){
          System.out.println("Something went wrong!!");
        }

    }
}
