package Assignment8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int age = sc.nextInt();
            if (age < 18) {
                throw new CannotVote("You cammot vote");
            }
            if(age<21)
            {
                throw new Cannotdrink();
            }
            if(age<24)            {
                throw new cannotdrive();
            }
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("finally is runnning");
        }
    }

}
