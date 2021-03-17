import java.io.File;
import java.io.IOException;

public class CreateFile{
    public static void main (String [ ] args){
        try{
            File newFile = new File("");
            if(newFile.createNewFile())
            {
                 System.out.println("FileName is:"+ newFile.getName());
            }
            else
            {
               System.out.println("File name already exists!!");
            }
        }
        catch(Exception e){

        }

    }


}