public class trial extends Thread {
      public static void main (String [ ] args){
          trial thread1 = new trial();
          thread1.start();
          public void run(){
              System.out.println("Started inside run!!");
          }

      }

}
