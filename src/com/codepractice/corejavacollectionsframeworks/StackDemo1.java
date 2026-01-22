package com.codepractice.corejavacollectionsframeworks;

import java.util.Stack;
class Person {
    String name;

    Person(String name){
        this.name = name;
    }
}

public class StackDemo1 {
    public static void main(String[] args) {


        Stack<Person> s = new Stack<>();
        s.push(new Person("A"));

        Person p = s.get(0);
        p.name = "B"; //Changes or mutates the object
        System.out.println(p.name);
    }
}
