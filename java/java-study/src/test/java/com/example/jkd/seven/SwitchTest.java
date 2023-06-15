package com.example.jkd.seven;

import org.junit.jupiter.api.Test;

public class SwitchTest {
    char type = 'A';
    String result = "";
    @Test
    void beforeSwitch(){
        switch(type){
            case 'a' :
                result = "a";
                break;
            case 'A' :
                result = "A";
                break;
            default :
                result = "error";
                break;
        }

        System.out.println(result);
    }

    @Test
    void afterSwitch(){
        switch(String.valueOf(type)){
            case "a" :
                result = "a";
                break;
            case "A" :
                result = "A";
                break;
            default :
                result = "error";
                break;
        }

        System.out.println(result);
    }
}
