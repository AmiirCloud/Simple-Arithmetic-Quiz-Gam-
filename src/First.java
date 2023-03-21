import java.util.Scanner;

public class First {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double rate  = 0.05;
        System.out.println("Enter Your  Sales");

         double sales  = sc.nextDouble();
         double tax  = sales* rate;
        System.out.println("Your Tax to pay is "+tax);
//======================================================
        System.out.println("Enter Seconds");
        int seconds  = sc.nextInt();
        int hour =  (seconds)/3600;
        int mintues =  seconds / 60;
        int sec =  seconds  % 60;
        System.out.println(seconds+"  seconds are  "+" 0"+hour +"  Hours  "+ ""+mintues +"  Minutes" +" and  "+sec+"0"+" seconds");

        System.out.println("Enter Celsius ");
        double  c  = sc.nextDouble();
        double fa  =  (c*9.0)/5+32;
        System.out.println("The Farenheit is "+ (int)fa);
        // programe to print the hello word using the java programing langauge
        System.out.println("Thei prgorme whill print teh hello word ");

    }
}
