package Overload;
import java.util.Scanner;

public class 求和1至n {
    public static void main(String[] args){
        System.out.println("Plz input n:");

        sum();
        //System.out.println();
    }

    public static int sum(){
        int result=0;
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        for(int i=1;i<=n;i++){
            result=result+i;
        }
        System.out.println("1~"+n+"的数字之和为："+result);

        return result;
    }
}
