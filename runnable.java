public class trial implements Runnable {
     public static void main(String  [ ] args){
         trial obj = new trial();
         Thread thread = new Thread(obj);
         thread.start();
         System.out.println("Started outside!!");
         public void run (){
             System.out.println("Started inside run!!");
         }

     }



}
