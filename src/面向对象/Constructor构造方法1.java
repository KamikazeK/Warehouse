package 面向对象;

public class Constructor构造方法1 {
    public static void main(String[] args){
        Studentt s1=new Studentt();//此行代码==“new Studentt();”

        System.out.println(s1);
        dosome();
        new Studentt(100);

    }
    public static void dosome(){
        System.out.println("do some....");
    }

}

//类
class Studentt{
    int age;

    public Studentt(){
        System.out.println("无参数的构造方法执行了");
    }

    public Studentt(int i){
        System.out.println(i);
    }
}
