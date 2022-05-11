package Overload;
import java.util.*;

public class 阶乘非递归 {
    public static void main(String[] args){
        System.out.println("Plz input a num: ");
        Scanner input=new Scanner(System.in);
        long n= input.nextLong();
        //int n=5;
        long returnValue=method(n);
        System.out.println(returnValue);
    }

    public static long method(long n){
        long result=1;
        for(long i=n;i>0;i--){
            result=result*i;
        }
        return result;
    }
}
