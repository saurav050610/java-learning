package switch_case;
import java.util.Scanner;
public class AgeGroup {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age group:");
        String value=sc.nextLine();
        switch (value){
            case "<13":
                System.out.println("Child");
                break;
            case"13-19":
                System.out.println("Teenager");
                break;
            case "20-59":
                System.out.println("Adult");
                break;
            case"+60":
                System.out.println("Senior");
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
