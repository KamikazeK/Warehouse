package pre;
import java.util.*;

public class 求和递归 {
    public static void main(String[] args){
        System.out.println("Plz input n");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        //int n=4;

        int returnValue=sum(n);
        System.out.println("运算结果是： "+returnValue);
    }

    public static int sum(int n){

        if(n==1){
            return 1;
        }
        return n+sum(n-1);

    }
}
