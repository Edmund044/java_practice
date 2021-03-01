import java.util.Scanner;
 class inputs{
     public static void main (String [ ] args){
         Scanner myObj = new Scanner(System.in);
         System.out.println("Please enter name and salary");
         String name = myObj.nextLine();
         double salary = myObj.nextDouble();
         System.out.println("Name is:"+ name);
         System.out.println("Salary is:"+ salary);

     }

 }