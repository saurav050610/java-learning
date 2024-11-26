package homework;
import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a number");
        int sum=0;
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e= sc.nextInt();
        int f= sc.nextInt();
        int g= sc.nextInt();
        int h= sc.nextInt();
        int i= sc.nextInt();
        int j= sc.nextInt();
        sum=sum+a+b+c+d+e+f+g+h+i+j;
        System.out.println("sum of all the 10 integers are" +sum);
    }
}
