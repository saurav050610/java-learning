package loops.forLoop;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int on = n;
        int temp=n;
        int sum=0, count=0;
        // Loop for finding number of digits
        while(temp>0){
            temp=temp/10;
            count++;
        }
        System.out.println(count);
        while(n>0){
            int rem=n%10;
            sum=sum+(int)Math.pow(rem,count);
            n=n/10;
        }
        System.out.println("sum of all the digits " +sum);
        if(sum==on){
            System.out.println(on+" is an armstrong number");
        }else{
            System.out.println(on+" is not an armstrong number");
        }
    }
}