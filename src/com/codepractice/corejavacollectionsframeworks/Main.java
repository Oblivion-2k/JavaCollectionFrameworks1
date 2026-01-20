package com.codepractice.corejavacollectionsframeworks;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //  int[] array1 = new int[10]; //The syntax to declare an array of size 10 elements. But the size is fixed to 10 and cannot me increased.
        ArrayList <Integer> arrayList1 = new ArrayList<Integer>(); //Using ArrayList to create and list of elements and perform operation using the methods defined in it.
        arrayList1.add(5);
        arrayList1.add(5);
        arrayList1.add(5);
        // System.out.println(arrayList1);
        System.out.println(arrayList1.get(2));
        System.out.println(arrayList1.size());







    }
}
