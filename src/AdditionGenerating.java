import java.util.Scanner;

public class AdditionGenerating {
    public boolean userAsn = false;

    public boolean addition() {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int end = 100;
        boolean userAns = false;
        int random_num3 = (int) Math.floor(Math.random() * (end - start + 1) + start);
        int random_num2 = (int) Math.floor(Math.random() * (end - start + 1) + end);
        int sum = random_num2 + random_num3;
        System.out.println("What is the sum  of " + random_num2 + " + " + random_num3);
        int ans = sc.nextInt();
        if (ans == sum) {
            userAns = true;
        } else {
            userAns = false;
        }
        return userAns;
    }

    public boolean multiplication() {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int end = 100;
        boolean userAns = false;
        int random_num3 = (int) Math.floor(Math.random() * (end - start + 1) + start);
        int random_num2 = (int) Math.floor(Math.random() * (end - start + 1) + end);
        int mul = random_num2 + random_num3;
        System.out.println("What is the Multiplication  of " + random_num2 + " * " + random_num3);
        int ans = sc.nextInt();
        if (ans == mul) {
            userAns = true;
        } else {
            userAns = false;
        }
        return userAns;
    }

    public boolean Substraction() {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int end = 100;
        boolean userAns = false;
        int random_num3 = (int) Math.floor(Math.random() * (end - start + 1) + start);
        int random_num2 = (int) Math.floor(Math.random() * (end - start + 1) + end);
        int sub = random_num2 - random_num3;
        System.out.println("What is the   of  Substractionm OF " + random_num2 + " - " + random_num3);
        int ans = sc.nextInt();
        if (ans == sub) {
            userAns = true;
        } else {
            userAns = false;
        }
        return userAns;
    }

    public boolean devision() {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int end = 100;
        boolean userAns = false;
        int random_num3 = (int) Math.floor(Math.random() * (end - start + 1) + start);
        int random_num2 = (int) Math.floor(Math.random() * (end - start + 1) + end);
        int div = random_num2 / random_num3;
        System.out.println("What is the div  of " + random_num2 + " / " + random_num3);
        int ans = sc.nextInt();
        if (ans == div) {
            userAns = true;
        } else {
            userAns = false;
        }
        return userAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wecme to the Simple Quiz Game  !");
        System.out.println("Do you want To play tab (Y) or (y)  for yes  Else tab any key to cancel ");
        String answer = sc.next();
        while ((answer.equals("Y")) || (answer.equals("y"))) {
            System.out.println("1. add");
            System.out.println("2. mul");
            System.out.println("3. div");
            System.out.println("4. sub");

            AdditionGenerating a  =  new AdditionGenerating();
            System.out.println("Enter What you want to play ");
            String userChoose  =  sc.next();
            switch (userChoose){
                case "add":
                    System.out.println("Solve These Addition Question ");
                    System.out.println(a.addition());
                    System.out.println("Do you want To play");
                     answer = sc.next();
                    break;
                case "mul":
                    System.out.println("Solve These Multiplication Question ");
                    System.out.println(a.multiplication());
                    break;
                case "sub":
                    System.out.println("Solve These Substraction Question ");
                    System.out.println(a.Substraction());
                    break;
                case "div":
                    System.out.println("Solve These Devision Question ");
                    System.out.println(a.devision());
                    break;
            }
        }
        System.out.println("Game Finished");

        }

    }

