package com.example.generic;


import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericOne {

    static void printList(Collection c) {
        Iterator list = c.iterator();

        while(list.hasNext()) {
            System.out.println(list.next());
        }
    }

    /*
    * One
    * - 제네릭을 사용하지 않을 때
    * - 컬렉션 요소의 타입이 보장 되지 않음
    *   (String, int, char, boolean..)
    * */
    public static void main(String args[]) {
        List arr = Arrays.asList("one", "two", 11);

        printList(arr);
    }
}
