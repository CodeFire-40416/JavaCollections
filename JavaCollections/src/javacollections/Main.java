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
        
        
        list.addFirst("Three");
        list.addFirst("Two");
        list.addFirst("One");
        
        list.addLast("Four");
        list.addLast("Five");
        list.add("Six");
        
        System.out.println(list);
        
        list.removeFirst();
        list.removeLast();
        
        System.out.println(list);
        
        
        
    }

}
