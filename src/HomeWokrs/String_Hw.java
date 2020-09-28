package HomeWokrs;

import java.util.Arrays;

public class String_Hw {
    public static void main(String[] args) {
        /**
         * store your full name in a variable, and display the following:
         * 1.Display length of the first name.
         * 2.Does your last name starts with "k"(ignore case)
         * 3.Print the last alphabet of your first name.
         * Does your name ends with "M"(ignore case)
         */

        String myFullName = "ikbal Hossen Shawan";
        System.out.println("my full name is : " + myFullName);

        //breaking down my name in every space
        String[] splitMyName = myFullName.split(" ");

        // find out the first space on my name
        int firstSpaceIndex = myFullName.indexOf(" ");

        //find out my firstname using subString method
        String firstName =myFullName.substring(0,firstSpaceIndex);

        //firstName length
        int lengthOf1stName = firstName.length();
        System.out.println("My first Name is : " + firstName + " and length is : " + lengthOf1stName);

        //find out the last space on=f my name
        int lastIndexOfSpace =myFullName.lastIndexOf(" ");


        // find out my lastname using substring method
       String lastName =myFullName.substring(lastIndexOfSpace+1);

       // does my lastname starts with k
        boolean lastNameStw_k = lastName.startsWith("k");
        System.out.println("my last name is : " + lastName + " & does it start with K :" + lastNameStw_k);

        //last alphabet of my first name
        char lastA = firstName.charAt(firstSpaceIndex - 1);
        System.out.println("last alphabet of my first name is : " + lastA);

        boolean lastNameEndsWith_M= lastName.endsWith("M");

        System.out.println("does my last name ends with M: " + lastNameEndsWith_M);

        System.out.println("*****************************************");

        /**
         *  String myStastement = "i am a good programmer"
         *  using string methods to do the following:
         *  Display the total number of words in the myStatement
         *  replace all thr 'r' character with 'f' character
         */

        String myStatement = "i am a good programmer";
        System.out.println("Statement is : " + myStatement);
        String[] afterSplit =myStatement.split("");
        //System.out.println(Arrays.toString(afterSplit));
        int length = afterSplit.length;
        System.out.println("total number of my statement is : " + length);
        String replace_r_to_f = myStatement.replaceAll("r","f");
        System.out.println("after replacing all 'r' to 'f' charecter : " + replace_r_to_f);

        System.out.println("****************************");

        /**
         * Store your first name in  String variable
         * calculate the length of your first name, without using length() method of String class.
         */


        String myname = "Shawan Hassan";
        String[] name = new String[2];
        name[0] = "shawan";
        name[1] = "hassan";
        int firstNameLength = name[0].length();
        System.out.println(firstNameLength);











    }









}
