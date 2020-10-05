package Class7;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {

        // Subject - Homework-5

        /**
         * write a code to print the reverse of a given string
         *
         * "happy"
         *
         * ""yppah
         */
        String word = "happy";

        int lastindex = word.length() - 1;
        //char charAtLastLdx = word.charAt(lastindex);

        System.out.println("the reverse  string of " + word + " is : " );
        for (int i = lastindex; i >= 0; i--) {
            System.out.print(word.charAt(i));


        }


        System.out.println();
        System.out.println("******************");


        /**
         * Write code/method to return abbreviation for any given string
         * Example: String msg = "Outfit of the day"
         * Expected: OOTD   // GM HAGDTY
         * String msg = "have a great day to you"
         *
         * //code
         *
         * sout("Abbreviation : " + abr);
         */


        String msg = "have a great day to you ";
        String[] splitMsg = msg.split(" ");

        System.out.println("the return abbreviation is : ");
        for (int d = 0; d < splitMsg.length; d++) {
            String s = splitMsg[d];
            System.out.print(s.charAt(0));


        }
        System.out.println();
        System.out.println("************************");









        /**
         * Change the string to title case
         */
        String line = "once upOn a tiMe in the UNIVERSE";   //  Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
        // code

        String[]splitLine= line.split(" ");
        int w = 0;
     //  String split = line.substring(0,1);
        //System.out.println(split.toUpperCase());
        System.out.println("Line (After modification) : " + line);


        System.out.println("***********************");








        /**
         * reverse a string
         */
        String message = "happy holidays"; //syadiloh yppah
       // String[] splitMessage =message.split(" ");
        int lastIndex =message.length()-1;
        //String reverseMessage = "";

        System.out.print("the reverse  message is : ");
        for(int z=lastIndex;z>=0;z--){
            System.out.print(message.charAt(z));

        }





       // String reverseMessage = "";
        //System.out.println("Message : " + message);
        // code
        //System.out.println("Message in reverse: " + reverseMessage);    // syadiloh yppah











        }
    }



