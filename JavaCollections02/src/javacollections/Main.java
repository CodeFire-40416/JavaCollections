/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.LinkedList;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        System.out.println(list);

        // LIFO
        System.out.println("LIFO");
        for (int i = 0; i < list.size() - 1; i++) {
            String first = list.removeFirst();
            list.addLast(first);

            System.out.println(list);
        }

        // FILO
        System.out.println("FILO");
        for (int i = 0; i < list.size() - 1; i++) {
            String last = list.removeLast();
            list.addFirst(last);

            System.out.println(list);
        }

    }

}
