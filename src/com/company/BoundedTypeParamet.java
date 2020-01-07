package com.company;

public class BoundedTypeParamet {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        integerBox.inspect("some text"); // error: this is still String!
    }

    //Multiple Bounds
    class X<T extends Number & Comparable<T>>{}

    /*
    A type variable with multiple bounds is a subtype of all the types listed in the bound.
    If one of the bounds is a class, it must be specified first.
    */
    Class A { /* ... */ }
    interface B { /* ... */ }
    interface C { /* ... */ }

    class D <T extends A & B & C> { /* ... */ }
}

class Box<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

}
