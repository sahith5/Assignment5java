package Assignmnet1;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Assignmnet1 {

    public static void main(String[] args) {
        ArrayList<File> filelist = new ArrayList<>();
        String mainDir = "/home/sahitB";
        File file = new File(mainDir);
        Stack<File> s = new Stack<>();
        s.push(file);
        // initially stack is not empty
        System.out.println("Content of Directory " + mainDir
                + " is");
        while (!s.empty()) {
            File tmpF = s.pop();
            // check if it is a file or not
            if (tmpF.isFile()) {
                // print file name can code here according
                // to our need
                filelist.add(tmpF);
//                    System.out.println(tmpF.getName());
            } else if (tmpF.isDirectory()) {
                // It's an directory hence list and push all
                // files in stack
                File[] f = tmpF.listFiles();
                for (File fpp : f) {
                    s.push(fpp);
                }
            } // else if ends here
        } // stack is not empty loop ends here
        while(true) {
            int flag=0;
            System.out.println("enter the file name");
            Scanner sc = new Scanner(System.in);
            String pattern = sc.nextLine();

            for (File f : filelist) {
                String filenamestr = f.getName();

                if (filenamestr.matches("(.*)" + pattern + "(.*)")) {
                    Path path = Paths.get(f.getName());
                    System.out.println(path.toAbsolutePath());
                    flag=1;
                }



            }
            if(flag==0)
            {
                System.out.println("No file found");
                break;
            }

        }

    }
}
