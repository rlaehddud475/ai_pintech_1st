package exam02;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID=1000l;
    private String name;
    private transient int age;
    private String job;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo(){
        System.out.printf("name=%s, age=%d%n", name,age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
