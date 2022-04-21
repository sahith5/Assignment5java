package Assignment6;



public class VampireNumbers {


    static int count=0;
    public static void main(String[] args) {
        int vampire = 1260;

        while (count<200){

            if (vampire % 2 != 0)
                vampire++;

            permutation(Integer.toString(vampire), "",vampire);
//            System.out.println(count);

            vampire++;
        }
    }

    public static void permutation(String str, String ans,int vampire) {

        if (str.length() == 0) {

            String x = ans.substring(0, ans.length() / 2);
            String y = ans.substring(ans.length() / 2);



            if (Integer.parseInt(x) * Integer.parseInt(y) == vampire && !((x.charAt(x.length() - 1) == '0' && y.charAt(y.length() - 1) == '0'))) {

                System.out.println(x+" * " +y+" = "+Integer.parseInt(ans));
                count+=1;

            }


        }


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String ros = str.substring(0, i) +

                    str.substring(i + 1);
            permutation(ros, ans + ch,vampire);
        }
    }


}
