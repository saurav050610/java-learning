package homeworks;
import java.util.Scanner;
public class Homework5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        String value=sc.nextLine();
        switch (value){
            case "<6 chars":
                System.out.println("Weak");
                break;
            case "6-10 chars":
                System.out.println("Medium");
                break;
            case ">10 chars":
                System.out.println("Strong");
                break;
            default:
                System.out.println("Invalid choice");

        }

    }
}
