package com.codepractice.corejavacollectionsframeworks;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class myArrayList {
    public static void main(String[] args) {
        List <Integer> myList = new ArrayList<Integer>(); //refernce here can be of List type since it is the parent class for ArrayList
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        System.out.println(myList);
        System.out.println(myList);
    }
}
