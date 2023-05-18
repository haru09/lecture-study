package stream;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "[Name : "+name +", Age : "+age+"]";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name.equals(person.name);
    }

    @Override
    public int hashCode() { return name.hashCode(); }

    @Override
    public int compareTo(Person person){
        if (this.age > person.getAge()){
            return 1;
        } else if ( this.age == person.getAge())
        {
            return 0;
        } else {
            return -1;
        }
    }
}
