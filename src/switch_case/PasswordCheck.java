package switch_case;
import java.util.Scanner;
public class PasswordCheck {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter chars");
        String value=sc.nextLine();
        switch (value){
            case "<6 chars":
                System.out.println("Weak");
                break;
            case "6-10":
                System.out.println("Medium");
                break;
            case ">10 chars":
                System.out.println("Strong");
                break;
            default:
                System.out.println("Invalid chars");
        }
    }
}
