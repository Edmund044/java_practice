import java.util.Scanner;
class Myclass {
    public static void main (String [ ] args){
        Scanner object = new Scanner(System.in);
        int days = object.nextInt();
        int output = days*24*60*60;
        System.out.println(output);

    }
}
