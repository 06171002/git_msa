package org.example;

public class Person implements Comparable<Person>{
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        String s1 = name;
        String s2 = o.getName();

        char[] cArr1 = s1.toCharArray();
        char[] cArr2 = s2.toCharArray();

        for (int i = 0; i < Math.min(cArr1.length, cArr2.length); i++) {
            if (cArr1[i] != cArr2[i])
                return cArr1[i]-cArr2[i];

        }
        return cArr1.length - cArr2.length;
    }
}
