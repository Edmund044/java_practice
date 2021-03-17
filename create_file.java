import java.io.File;
import java.io.IOException;

class CreateFile{
    public static void main (String [ ] args){
        try{
            File newFile = new File("file.txt");
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
           System.out.println("Something went wrong!!");
        }
        try {
            File obj = new File("file.txt");
            if(obj.delete()){
                System.out.println("FILE "+obj.getName() +" IS DELETED");
            }
            else
            {
                System.out.println("FILE NOT DELETED");
            }
        }
        catch(Exception e){
           System.out.println("Something went wrong during file deletion!!");
        }

    }


}