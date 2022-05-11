package Overload;
import java.util.*;

public class 阶乘递归 {
    public static void main(String[] args){
        System.out.println("Plz input a num: ");
        Scanner input=new Scanner(System.in);
        long n=input.nextLong();
        long returnValue=method(n);

        System.out.println(returnValue);
    }

    public static long method(long n){
        if(n==1){
            return 1;
        }
        else{
            return n*method(n-1);
        }
    }

}
