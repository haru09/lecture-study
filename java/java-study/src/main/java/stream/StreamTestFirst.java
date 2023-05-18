package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTestFirst {

    List<Person> persons;

    List<Person> beforeSet(){
        persons = new ArrayList<Person>();

        persons.add(new Person("Park", 35));
        persons.add(new Person("Kim", 28));
        persons.add(new Person("Eom", 42));
        persons.add(new Person("Lee", 30));
        persons.add(new Person("Eun", 55));
        persons.add(new Person("Choi", 33));

        return persons;
    }

    public void notUserdTest() {
        System.out.println("==============notUserdTest======");
        List<Person> list = new ArrayList<>();

        for(Person person : persons){
            if(person.getAge() > 30) {
                list.add(person);
            }
        }       // age > 30 이상

        Collections.sort(list);     // 오름차순

        List<String> results = new ArrayList<String>();

        for(Person person : list){
            results.add(person.getName());
        } // 이름

        for(String name : results){
            System.out.println(name);
        }
    }

    public void usedTest() {
        System.out.println("==============usedTest======");
        List<String> PersonsNames = persons.stream()
                .filter(Person -> Person.getAge() > 30)
                .sorted()
                .map(Person::getName)
                .collect(Collectors.toList());

        for(String name : PersonsNames){
            System.out.println(name);
        }
    }

    public static void main(String[] args){
        System.out.println("일반적인 리스트 사용과 스트림 사용 테스트");
        StreamTestFirst first = new StreamTestFirst();
        first.beforeSet();
        first.notUserdTest();
        first.usedTest();
    }
}
