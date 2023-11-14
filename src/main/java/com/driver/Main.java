/*
Method Overriding

Task 1: create a class A, with a method named meth having returning a string "Invoking method from class A"
Task 2: create a class B which extends class A
Task 3: create object of class B and call method meth of class A with it
Task 4: Now override methode meth of class A in class B, which returns the following string "Method is overridden in Extendend class B"
Task 5: call this overridden method from obj of class B
 */

package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth());

        System.out.println(obj.meth());
    }
}

class A {
    public String meth() {
        return "invoking method from class A";
    }

}

class B extends A {

    @Override 
    public String meth() {
        return "overridden method from obj class B";
    }
}