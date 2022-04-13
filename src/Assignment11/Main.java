package Assignment11;

import com.sun.source.tree.TryTree;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        HashMap<Character,Integer> mp=new HashMap<>();
        Scanner sc;
        try {
            sc=new Scanner(new File("input.txt"));
            PrintWriter pw=new PrintWriter("output.txt");
            while(sc.hasNext())
            {
                String str=sc.nextLine();
                for(int i=0;i<str.length();i++)
                {
                  mp.put(str.charAt(i),mp.get(str.charAt(i))+1); //mp.get(str.charAt(i))
                }
            }


        }
        catch (Exception e)
        {
            System.out.println(e);
        }



    }
}
