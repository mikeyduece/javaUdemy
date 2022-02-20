package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1; i <= 100; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("SQ = " + squares.size());
        System.out.println("Cubes = " + cubes.size());

        // bulk ops are destructive
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union = " + union.size());

        // removeAll() == Array#| in ruby returns the contents in both, with duplicates removed
        // retainAll() == Array#& in ruby returns the duplicates (intersection)
        // addAll() will combine the two sets, but not duplicate any elements as Sets cannot add duplicates of the same type using equals() and hashCode()
        // containsAll() test if one set is superset of another, non destructive. Array#include?

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection = " + intersection.size());

        for(int i:intersection) {
            System.out.println(i + " is sqrt of " + Math.sqrt(i) + " and cube is " + Math.cbrt(i));
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = "all nature is but art unknown to thee".split(" ");
        String[] divineWords = "to err is human to fogive divine".split(" ");
        nature.addAll(Arrays.asList(natureWords));
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("nature - divine");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);
        printSet(intersectionTest);
    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for(String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
