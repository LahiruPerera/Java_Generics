package com.company;

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");

        System.out.println("p1 : -> key : " + p1.getKey() + " value : " + p1.getValue());
        System.out.println("p2 : -> key : " + p2.getKey() + " value : " + p2.getValue());

        /*
        Java compiler can infer the K and V types from the declaration OrderedPair<String, Integer>, these statements can
        be shortened using diamond notation:
        */

        Pair<String, Integer> p1_v1 = new OrderedPair<>("Even", 8);
        Pair<String, String> p2_v1 = new OrderedPair<>("hello", "world");
    }
}
