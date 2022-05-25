package 面向对象;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.classnumber);
        System.out.println("------------");
        s1.classnumber= 6;
        System.out.println(s1.classnumber);
        Student s2 = new Student();
        System.out.println(s2.classnumber);
    }
}
