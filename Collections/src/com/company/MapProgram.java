package com.company;

import java.util.HashMap;

public class MapProgram {
    public static void main(String[] args) {
        java.util.Map<String, String> languages  = new HashMap<>();
        languages.put("Java", "compiled high lvl OO, platform independant");
        languages.put("Python", "interpreted, OO, high level");
        languages.put("Algol", "Algorithmic language");
        languages.put("Basic", "Beginner, all purpose, symbolic");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));
        languages.put("Java", "this course is about Java");
        System.out.println(languages.get("Java"));
    }
}
