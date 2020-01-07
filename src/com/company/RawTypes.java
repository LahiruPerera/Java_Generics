package com.company;

public class RawTypes {

    // Generic box class

    public class Box<T> {
        public void set(T t) { /* ... */ }
        // ...
    }

    Box<Integer> intBox = new Box<>();

    //If the actual type argument is omitted, you create a raw type of Box<T>:

    Box rawBox = new Box();

}
