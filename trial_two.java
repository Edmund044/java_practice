import java.util.Scanner;
public class trial_two {
    public static void main (String [ ] args){
        Scanner object = new Scanner(System.in);
        double amount = object.nextInt();
        double interest = 0.1;
        double remaining = 0;
        int i =0;
        double payment = 0;
        while(i<6){
            payment = interest*amount;
            remaining =amount-payment;

            i++;
        }
        System.out.println(payment);
    }
}
