package switch_case;
import java.util.Scanner;
public class StudentScore {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter score:");
        String value=sc.nextLine();
        switch (value){
            case "90-100":
                System.out.println("A");
                break;
            case "80-89":
                System.out.println("B");
                break;
            case "70-79":
                System.out.println("C");
                break;
            case "60-69":
                System.out.println("D");
                break;
            case "below 60":
                System.out.println("F");
                break;
            default:
                System.out.println("Invalid score");

        }
    }
}
