package com.company;

public class GenericTypes {

    //A Simple Box Class

    public class Box {
        private Object object;

        public void set(Object object) { this.object = object; }
        public Object get() { return object; }
    }

    /*
    A generic class is defined with the following format:

    class name<T1, T2, ..., Tn> { *//* ... *//* }
    */

    /**
     * Generic version of the Box class.
     * @param <T> the type of the value being boxed
     */
    public class Generic_Box<T> {
        // T stands for "Type"
        private T t;

        public void set(T t) { this.t = t; }
        public T get() { return t; }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
