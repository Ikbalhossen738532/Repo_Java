package class9;

public class mainMethod_HW7 {
    public static void main(String[] args) {
        //homework 7

       subMathod_HW7 addnum = new subMathod_HW7();
        /**
         *1. Create a method to add all the numbers in a array with double-values
         *
         */
       double[] number = {10,20,30,40};
        System.out.println(addnum.addNum(number));
        System.out.println("********************");


        /**
         *  Create a method to verify if the input-int-number is prime or not
         */
        subMathod_HW7 checkprime = new subMathod_HW7();
        int n = 11;
        System.out.println(checkprime.isprimeNumber(n));
        System.out.println("*********************");


        /**
         * Create a method to find if given string is palindrome.
         */
        subMathod_HW7 s = new subMathod_HW7();
        String givenName = "racecar";
        System.out.println(s.paralindrome(givenName));
        System.out.println("************************");

        /**
         * Write a method to print(no return) the duplicate values in a given String array.
         */

        subMathod_HW7 q = new subMathod_HW7();
        String[] w = {"hello", "peace", "happy" , "hello", "Happy", "hello"};
       q.findDublicate(w);
        System.out.println("*********************");

        /**
         *  Write a method to print(no return) the common values between two arrays (string arrays)
         */
        subMathod_HW7 o = new subMathod_HW7();
        String[] name1={"hello", "peace", "happy"};
        String[] name2={"hello", "grow", "laugh" , "peace"};
        o.findCommon(name1,name2);



    }



}
