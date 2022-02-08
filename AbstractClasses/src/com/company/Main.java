package com.company;

import com.company.States.Fl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class Main {
    private static final String BASE_CLASS_NAME = "com.company.States.";

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
//        ResponseObject responseObject = new ResponseObject("Fl");
//        String state = responseObject.getState();
//        try {
//            Class<?> classRef = Class.forName(BASE_CLASS_NAME + state);
//            Method buildReturn = classRef.getMethod("buildReturn", String.class);
//            Object instance = classRef.getDeclaredConstructor().newInstance();
//            buildReturn.invoke(instance, state);
//        } catch(Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println("State: " + state + " class does not exist.");
//        }
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for(String s : data) tree.addItem(new Node(s));
        tree.traverse(tree.getRoot());

    }

}

