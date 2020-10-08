package Class7;

import java.util.Arrays;

public class HomeWork_7 {
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
       // String line = "once upOn a tiMe in the UNIVERSE";   //  Once Upon A Time In The Universe
        //System.out.println("Line (Before modification) : " + line);
        // code
//       String newLine = line.toLowerCase();
//        System.out.println(newLine);
//
//        String[]splitLine= newLine.split(" ");
//        int length =splitLine.length;
//        String f = newLine.substring(0,1).toUpperCase();
//        int r = f.length();
//
//       for(int q=r;q<=length;q++){
//           String sa = splitLine[r];
//
//       }
        String line = "once upOn a tiMe in the UNIVERSE";
        System.out.println(line);
        String[] str = line.toLowerCase().split(" ");
        line = "";
        for(int b=0; b<str.length; b++) {
            line = line + " " + str[b].substring(0,1).toUpperCase()+str[b].substring(1);
        }
        System.out.println(line);





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



