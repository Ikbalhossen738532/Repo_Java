package MidTerm;

import java.util.ArrayList;

public class sony_1 {

    // question 1
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50,60,40,50,50,50,70};
        arrayElement(num,50);


    }
    public static void arrayElement(int []a,int removenumber) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();


        for (int i=0; i<a.length;i++) {
            arrlist.add(a[i]);
        }
        System.out.println("Size of list: " + arrlist.size());

        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }


        int b;



        for(int i=0;i<arrlist.size();i++) {
            // for (Integer number : arrlist) {
            if ( arrlist.contains(removenumber)) {

                b = arrlist.indexOf(removenumber);
                // System.out.println("Index value of r :"+a);
                arrlist.remove(b);


            }


        }
        System.out.println("After removing the number:"+removenumber+" from the array"+ "\n"+"Current size of array is "+arrlist.size());
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }

    }

////////////////////////////////////////////////////////////////////////////////////

    //question 1 :another way
//    public static void main(String[] args) {
//
//        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
//        //  Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}
//
//        arrlist.add(32);
//        arrlist.add(14);
//        arrlist.add(24);
//        arrlist.add(98);
//        arrlist.add(45);
//
//        System.out.println("Size of list: " + arrlist.size());
//
//        for (Integer number : arrlist) {
//            System.out.println("Number = " + number);
//        }
//        int r= 24;
//
//        int a;
//
//        a = arrlist.indexOf(r);
//        System.out.println("Index is "+a);
//        System.out.println("Now, Size of list: " + arrlist.size());
//
//        for (Integer number : arrlist) {
//            if ( number==r) {
//
//                a = arrlist.indexOf(r);
//                arrlist.remove(number);
//                arrlist.remove(r);
//
//
//            }
//            System.out.println("Number = " + number);
//        }
//
//
//    }


}
