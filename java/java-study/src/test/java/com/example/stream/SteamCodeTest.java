package com.example.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SteamCodeTest {
    List<Code> codeList;
    class Code {
        private String cd;
        private String cdNm;
        private String desc;

        public void setCd(String cd){this.cd = cd;}
        public String getCd(){return this.cd;}
        public void setCdNm(String cdNm){this.cdNm = cdNm;}
        public String getCdNm(){return this.cdNm;}
        public void setDesc(String desc){this.desc = desc;}
        public String getDesc(){return this.desc;}
    }

    @BeforeEach
    public void setUp(){
        codeList = new ArrayList<>();
        Code code = new Code();
        code.setCd("10");
        code.setCdNm("축구");
        code.setDesc("구기종목");
        codeList.add(code);

        code = new Code();
        code.setCd("20");
        code.setCdNm("야구");
        code.setDesc("구기종목");
        codeList.add(code);

        code = new Code();
        code.setCd("30");
        code.setCdNm("배구");
        code.setDesc("");
        codeList.add(code);

        code = new Code();
        code.setCd("40");
        code.setCdNm("마라톤");
        code.setDesc("육상");
        codeList.add(code);

        code = new Code();
        code.setCd("50");
        code.setCdNm("수영");
        code.setDesc("수영");
        codeList.add(code);

        code = new Code();
        code.setCd("60");
        code.setCdNm("농구");
        code.setDesc("구기종목");
        codeList.add(code);

        code = new Code();
        code.setCd("60");
        code.setCdNm("농구");
        code.setDesc("구기종목");
        codeList.add(code);
    }

    public void print(){
        codeList.forEach(code -> System.out.println(code.getCdNm()));
        System.out.println("====================================");
    }

    @Test
    public void _removeSoccer(){
        print();

        codeList.removeIf(code -> code.getCd().equals("10"));
        codeList.forEach(code -> System.out.println(code.getCdNm()));
        System.out.println("====================================");
    }

    @Test
    public void _removeDuplication(){
        print();

        codeList.stream()
                .distinct()
                .forEach(code -> System.out.println(code.getCdNm()))
        ;

        List<String> list = Arrays.asList("12", "12", "12", "12", "12", "13");
        list.stream()
                .distinct()
                .forEach(System.out::println)
        ;
    }
}
