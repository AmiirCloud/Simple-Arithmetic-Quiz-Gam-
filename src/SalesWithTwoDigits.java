import java.util.Scanner;

public class SalesWithTwoDigits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter  Number Of urchase");
        double sales   = sc.nextDouble();
        double salesTax  = sales * 0.06 ;
        System.out.println("Sales  Tax is : " + (int)(salesTax * 100)/100.0);
    }
}
