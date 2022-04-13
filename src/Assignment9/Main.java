package Assignment9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        if(str.matches("^[A-Z].*[.]$"))
        {
            System.out.println("Yes it starts with Capital letter and ends with period");
        }
        else{
         System.out.println(" it doesn't ends with period or it doesnot starts with Capitalletter");

        }


    }
}
