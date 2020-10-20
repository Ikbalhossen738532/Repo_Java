package MidTerm;

import java.util.ArrayList;

public class question_1 {
    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
        //  Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}

        arrlist.add(32);
        arrlist.add(14);
        arrlist.add(24);
        arrlist.add(98);
        arrlist.add(45);

        System.out.println("Size of list: " + arrlist.size());

        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }
        int r= 24;

        int a;

        a = arrlist.indexOf(r);
        System.out.println("Index is "+a);
        System.out.println("Now, Size of list: " + arrlist.size());

        for (Integer number : arrlist) {
            if ( number==r) {

                a = arrlist.indexOf(r);
                arrlist.remove(number);
                arrlist.remove(r);


            }
            System.out.println("Number = " + number);
        }


    }

}
