package homework;
import java.util.Scanner;
public class threedigt {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        if (n%2==0){
            System.out.println("you chooose an incorrect number");
        } else {
            System.out.println("correct number");
            if (n>99) {
                System.out.println("number is of 3 digit");
            } else {
                System.out.println("you choose a incorrect number");
                if (n%5==0){
                    System.out.println("number is multiple of 5");
                } else {
                    System.out.println("you chose a incorrect number");
                }
            }
        }
    }

}
