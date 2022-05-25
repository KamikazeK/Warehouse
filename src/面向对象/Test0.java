package 面向对象;

public class Test0 {
    public static void main(String[] args){
        Person p=new Person();
        p.age=10;
        add(p);
        System.out.println("main   "+p.age);
    }
    public static void add(Person p){
        p.age++;
        System.out.println("add  "+p.age);
    }
}

class Person{
    int age;
}//涉及到类 数值的改变在源头
