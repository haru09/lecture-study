package com.example.jkd.seven;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

public class TypeInterfaceTest {

    /*
    * 다이아몬드(<>) 지시자 사용
    * 제네릭 유형의 인스턴스 생성시 타입 생성이 가능
    * 기존 : new List<String, String>()
    * */
    @Test
    void beforeGeneric() {
        List<String> list = new ArrayList<String>();

        list.add("test1");
        list.add("test2");
        list.add("test3");

        list.forEach(System.out::println);
        list.forEach(str -> System.out.println(str));
    }

    @Test
    void afterGeneric() {
        List<String> list = new ArrayList<>();

        list.add("new_test1");
        list.add("new_test2");
        list.add("new_test3");

        list.forEach(System.out::println);
        list.forEach(str -> System.out.println(str));
    }
}
