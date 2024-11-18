package loops.forLoop;

import java.util.Scanner;

public class extract_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int sum=0;
        while(n>0) {
            int remainder = n % 10;
            sum=sum+remainder;
//            System.out.println("Extracted digit in this step: " + remainder);
            n = n / 10;
        }
        System.out.println("The sum of all the digits is "+sum);
    }
}
