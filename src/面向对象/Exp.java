package 面向对象;

public class Exp {
    public static void main(String[] args){
        Customer c=new Customer();
        System.out.println(c.id);

        c.id=007;
        System.out.println(c.id);

    }
}

class Customer{
    int id;
}