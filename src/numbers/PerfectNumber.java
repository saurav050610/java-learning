package numbers;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n =sc.nextInt();
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=i+sum;

            }
        }
        System.out.println(sum);
        if (sum==n) {
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It is not a perfect number");

        }
    }
}
