package com.example.helloworld.Collection;

import java.util.LinkedList;

public class LinkedListApi {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        //pollFirst弹出第一个
        //linkedList.pollFirst();
        //System.out.println(linkedList);
        //poll也是弹出第一个：linkedList.poll();
        System.out.println(linkedList);
        //peekLast取出第一个
        //System.out.println(linkedList.peekLast());
        //pollLast弹出最后一个
        linkedList.pollLast();
        System.out.println(linkedList);

    }
}
