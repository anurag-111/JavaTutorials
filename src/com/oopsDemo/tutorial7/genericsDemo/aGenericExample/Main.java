package com.oopsDemo.tutorial7.genericsDemo.aGenericExample;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer, String> object = new GenericClass<>(123, "Hey!");
        System.out.println(object);
    }
}
